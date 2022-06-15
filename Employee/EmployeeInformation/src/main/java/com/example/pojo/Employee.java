package com.example.pojo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="emp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empid;
	String empname;
	int contact;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public Employee() {
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", contact=" + contact + "]";
	}
	public Employee(int empid, String empname, int contact) {
		this.empid = empid;
		this.empname = empname;
		this.contact = contact;
	}
}
