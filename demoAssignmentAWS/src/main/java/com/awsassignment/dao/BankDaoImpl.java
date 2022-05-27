package com.awsassignment.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.awsassignment.pojo.Bank;
import com.awsassignment.repository.BankRepository;
@Component
public class BankDaoImpl {
	private BankRepository bankrepo;
	public BankDaoImpl() {
	}
	@Autowired
	public BankDaoImpl(BankRepository bankrepo) {
		this.bankrepo = bankrepo;
	}
	public Bank saveBankdatails(Bank bank) {
		return   bankrepo.save(bank);
	}
}
