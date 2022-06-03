package com.awsassignment.app.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.awsassignment.pojo.Bank;
import com.awsassignment.repository.BankRepository;
@Component
public class BankDaoImpl implements BankDao{
	private BankRepository bankrepo;
	@Autowired
	public BankDaoImpl(BankRepository bankrepo) {
		this.bankrepo = bankrepo;
	}
	public BankDaoImpl() {
		
	}
	public Bank saveBankdatails(Bank bank) {
		return  bankrepo.save(bank);
	}
}