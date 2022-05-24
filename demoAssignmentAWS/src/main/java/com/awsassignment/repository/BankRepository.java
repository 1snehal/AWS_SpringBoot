package com.awsassignment.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.awsassignment.pojo.Bank;
@Repository
public interface BankRepository extends CrudRepository<Bank, Integer>{

}
