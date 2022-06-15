package com.example.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dao.EmployeeDao;
import com.example.pojo.Employee;
@RestController
public class EmployeeController {
	private EmployeeDao empdao;
	@Autowired
	public EmployeeController(EmployeeDao empdao) {
		this.empdao = empdao;
	}
	@RequestMapping("/display")
	public String show() {
		return "welcome";
	}
	@RequestMapping("/saveemployee")
	public String saveemp(@RequestBody Employee employee) {
		empdao.saveEmployee(employee);
		return "Successful....";
	}
	@RequestMapping("/deletebook/{eid}")
	public String deletebook(@PathVariable int eid) {
		empdao.deleteEmployee(eid);
		return "deleted successfully";
	}
	@RequestMapping("/deleteallemp")
	public String deleteallemployees() {
		empdao.deleteall();
		return "deleted all records";
	}
	@RequestMapping("/updatebook/{eid}")
	public String updatebook(@PathVariable int eid, @RequestBody Employee emp) {
		empdao.updateEmployee(eid,emp);
		return "Updated successfully";
	}
	@RequestMapping("/employeelist")
	public List<Employee> listofemployee(){
		List<Employee> emplists=empdao.employeeList();
		if(emplists.isEmpty()) {
			System.out.println("It`s empty");
		}
		return emplists;
	}
	@RequestMapping("/searchbyid/{eid}")
	public Optional<Employee> searchbyid(@PathVariable int eid) {
		return empdao.searchbyid(eid);
	}
}
