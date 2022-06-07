package com.awsassignment.dao;
import org.springframework.stereotype.Component;
import com.awsassignment.pojo.Bank;
@Component
public interface BankDao {
	void saveBankdatails(Bank bank);
}
