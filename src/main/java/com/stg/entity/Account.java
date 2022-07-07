package com.stg.entity;

import java.time.LocalDate;

public class Account {

	private int accNo;
	private String accHolderName;
	private double balance;
	private String mobileNo;
	private String panNo;
	private LocalDate accOpenDate;
	private String accType;
	private boolean accStatus;
	private Branch branch;
	private User user;
	
	public Account() {
		super();
	}		

	public Account(int accNo, String accHolderName, double balance, String mobileNo, String panNo,
			LocalDate accOpenDate, String accType, boolean accStatus, Branch branch) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.mobileNo = mobileNo;
		this.panNo = panNo;
		this.accOpenDate = accOpenDate;
		this.accType = accType;
		this.accStatus = accStatus;
		this.branch = branch;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public LocalDate getAccOpenDate() {
		return accOpenDate;
	}

	public void setAccOpenDate(LocalDate accOpenDate) {
		this.accOpenDate = accOpenDate;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public boolean isAccStatus() {
		return accStatus;
	}

	public void setAccStatus(boolean accStatus) {
		this.accStatus = accStatus;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Account(int accNo, String accHolderName, double balance, String mobileNo, String panNo,
			LocalDate accOpenDate, String accType, boolean accStatus, Branch branch, User user) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.mobileNo = mobileNo;
		this.panNo = panNo;
		this.accOpenDate = accOpenDate;
		this.accType = accType;
		this.accStatus = accStatus;
		this.branch = branch;
		this.user = user;
	}


}
