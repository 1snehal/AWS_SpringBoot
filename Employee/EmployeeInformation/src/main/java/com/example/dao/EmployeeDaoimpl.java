package com.example.dao;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.pojo.Employee;
import com.example.repo.EmployeeRepository;
@Component
public class EmployeeDaoimpl implements EmployeeDao{
	private EmployeeRepository repo;
	@Autowired
	public EmployeeDaoimpl(EmployeeRepository repo) {
		this.repo = repo;
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}
	@Override
	public Employee updateEmployee(int empid,Employee employee) {
		return repo.save(employee);
	}
	@Override
	public void deleteEmployee(int eid) {
		repo.deleteById(eid);
	}
	@Override
	public void deleteall() {
		repo.deleteAll();
	}
	@Override
	public List<Employee> employeeList() {
		List<Employee> empcollect=repo.findAll();
		return empcollect;
	}
	public Optional<Employee> searchbyid(int eid) {
		return repo.findById(eid);
	}
}
