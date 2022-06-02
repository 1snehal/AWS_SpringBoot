package com.awsassignment.dao;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.awsassignment.pojo.Bank;
import com.awsassignment.repository.BankRepository;
@Component
public class BankDaoImpl implements BankDao{
	private BankRepository bankrepo;
	public BankRepository getBankrepo() {
		return bankrepo;
	}
	@Autowired
	public BankDaoImpl(BankRepository bankrepo) {
		this.bankrepo = bankrepo;
	}
	@PostConstruct
	public Bank saveBankdatails(Bank bank) {
		System.out.println(bank);
		System.out.println(bankrepo);
		return  this.bankrepo.save(bank);
	}
}
