package com.gitDveloper3.ems.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gitDveloper3.ems.Models.Employee;
import com.gitDveloper3.ems.Services.EmployeeService;

@RestController

@RequestMapping("/api")
public class Controller {
	@Autowired
	EmployeeService service;
	@CrossOrigin(origins="*")
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		List<Employee> employeeList=service.getAll();
		return employeeList;
	}
	@GetMapping("/{id}")
	public Optional<Employee> getEmployee(@PathVariable("id") Long id){
		Optional<Employee> employeeList=service.get(id);
		return employeeList;
	}
	@CrossOrigin(origins="*")
	@PostMapping("/employees")
	public ResponseEntity<?>postEmployee(@RequestBody Employee emp) {
	return service.post(emp);

	}
	@CrossOrigin(origins="*")
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Long id){
		return service.delete(id);
	}
	@CrossOrigin(origins="*")
	@PutMapping("/employees")
	public ResponseEntity<?>editEmployee(@RequestBody Employee emp) {
	return service.edit(emp);

	}
	
	
	
	
	
	
}
