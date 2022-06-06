package com.awsassignment.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.awsassignment.pojo.Bank;
import com.awsassignment.repository.BankRepository;
@Component("bankdaoimplement")
public class BankDaoImpl implements BankDao{
	private BankRepository bankrepo;
	public BankRepository getBankrepo() {
		return bankrepo;
	}
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
