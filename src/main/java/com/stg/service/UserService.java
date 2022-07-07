package com.stg.service;

import com.stg.entity.Account;

public interface UserService {
	
	public abstract String sendMoney(String panNo,String mobileNo,double amount,int accNo);
	
	public abstract Account login(String username, String password);
	
}
