package com.awsassignment.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awsassignment.app.pojo.Bank;
@Repository
public interface BankRepository extends JpaRepository<Bank, Integer>{

}
