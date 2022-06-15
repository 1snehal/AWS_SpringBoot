package com.example.dao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;
import com.example.pojo.Employee;
@Component
public interface EmployeeDao {
	public Employee saveEmployee(Employee employee);
	Employee updateEmployee(int empid, Employee employee);
	public void deleteEmployee(int empid);
	public void deleteall();
	public List<Employee> employeeList();
	public Optional<Employee> searchbyid(int eid);
}
