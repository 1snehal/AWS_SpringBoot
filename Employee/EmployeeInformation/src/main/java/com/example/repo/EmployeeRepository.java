package com.example.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pojo.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
