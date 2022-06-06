package com.awsassignment.pojo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="info")
public class Bank {
	@Id
	String customerID;
	String branchID;
	int accountID;
	public Bank(String customerID, String branchID, int accountID) {
		this.customerID = customerID;
		this.branchID = branchID;
		this.accountID = accountID;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getBranchID() {
		return branchID;
	}
	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public Bank() {
		
	}
	@Override
	public String toString() {
		return "Bank [customerID=" + customerID + ", branchID=" + branchID + ", accountID=" + accountID + "]";
	}
	

	
}
