package com.awsassignment.app.dao;
import org.springframework.stereotype.Repository;

import com.awsassignment.pojo.Bank;
@Repository
public interface BankDao {
	Bank saveBankdatails(Bank banklist);
}