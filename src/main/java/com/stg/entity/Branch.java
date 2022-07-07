package com.stg.entity;

public class Branch {

	private int branchId;
	private String branchName;
	private String branchCity;

	public Branch() {
		super();
	}

	public Branch(int branchId, String branchName, String branchCity) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchCity = branchCity;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCity() {
		return branchCity;
	}

	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}

}
