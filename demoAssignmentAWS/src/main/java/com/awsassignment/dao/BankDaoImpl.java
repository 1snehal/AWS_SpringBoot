package com.awsassignment.dao;
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
	public void setBankrepo(BankRepository bankrepo) {
		this.bankrepo = bankrepo;
	}
	public Bank saveBankdatails(Bank bank) {
		return  bankrepo.save(bank);
	}
}
