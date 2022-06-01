package com.awsassignment.pojo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="information")
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int customerID;
	int branchID,accountID;
	public Bank() {
	
	}
	public Bank(int branchID, int accountID) {
		this.branchID = branchID;
		this.accountID = accountID;
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
		return "Bank [ branchID=" + branchID + ", accountID=" + accountID + "]";
	}
}
