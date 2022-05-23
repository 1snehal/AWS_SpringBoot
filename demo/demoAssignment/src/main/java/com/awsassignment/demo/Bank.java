package com.awsassignment.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Bank {
	@Id
	int customerID;
	int branchID,accountID;
	public Bank() {
		
	}
	public Bank(int customerid, int branchID, int accountID) {
		// TODO Auto-generated constructor stub
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getBranchID() {
		return branchID;
	}
	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	@Override
	public String toString() {
		return "Bank [customerID=" + customerID + ", branchID=" + branchID + ", accountID=" + accountID + "]";
	}
}
