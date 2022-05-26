package com.awsassignment.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.awsassignment.pojo.Bank;
import com.awsassignment.repository.BankRepository;
@Service
public class BankDaoImpl implements BankDao{
	@Autowired
	private BankRepository bankrepo;
	public BankRepository getBankrepo() {
		return bankrepo;
	}
	public void setBankrepo(BankRepository bankrepo) {
		this.bankrepo = bankrepo;
	}
	public Bank saveBankdatails(Bank bank) {
		System.out.println("i am in Bankimpl"+bank);
		return   bankrepo.save(bank);
	}
}
