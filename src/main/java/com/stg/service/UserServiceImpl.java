package com.stg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.stg.entity.Account;
import com.stg.exception.CustomException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String sendMoney(String panNo, String mobileNo, double amount, int accNo) {
		String result = null;
		Account sender = restTemplate
				.getForObject("http://localhost:8080/bank/account/getAccount/" + panNo + "/" + mobileNo, Account.class);

		Account receiver = restTemplate.getForObject("http://localhost:8080/bank/account/accounts/" + accNo,
				Account.class);
		if(sender.getAccNo()!=receiver.getAccNo()) {
			if (sender.isAccStatus()) {
				if(amount>0) {
					if (sender.getBalance() > amount) {
						
						restTemplate.put("http://localhost:8080/bank/account/withdraw/" + sender.getAccNo() + "/" + amount,
								Account.class);						
					
						restTemplate.put("http://localhost:8080/bank/account/deposit/" + receiver.getAccNo() + "/" + amount,
								Account.class);
		
						result = "Payment Successful";
					} else {
						throw new CustomException("Check Your Balance");
					}
				}else {
					throw new CustomException("Send a Valid Amount");
				}
			} else {
				throw new CustomException("Activate Your Account!");
			}
		}else {
			throw new CustomException("You Choosed Your Account");
		}
		return result;
	}

	@Override
	public Account login(String username, String password) {
		
		Account tempUser = restTemplate
		.getForObject("http://localhost:8080/bank/user/login?username=" + username + "&password=" + password, Account.class);
		
		if(tempUser!=null) {
			return tempUser;
		}else {
			throw new CustomException("User Not Found!");
		}
			
	}

}
