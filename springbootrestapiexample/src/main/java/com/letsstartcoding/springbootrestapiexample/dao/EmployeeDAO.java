package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Employee;
import com.letsstartcoding.springbootrestapiexample.repository.EmployeeRepository;

@Service
public class EmployeeDAO {

	@Autowired
	EmployeeRepository employeeRepository;
	
	//SAVE
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	//GET ALL
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}
	
	//GET by id
	public Employee findById(Long id) {
		return employeeRepository.findOne(id);
	}
	
	//DELETE by obj
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
	
}