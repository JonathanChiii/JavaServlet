package com.demo.service;

import java.util.List;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;
import com.demo.repositoryImpl.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public String save(Employee e) {
        return employeeRepository.save(e);
    }

    @Override
    public void update(Employee e) {
        employeeRepository.update(e);
    }

    @Override
    public List<Employee> getAllData() {
        return employeeRepository.getAllData();
    }

    @Override
    public Employee getById(int id) {
        return employeeRepository.getById(id);
    }

    @Override
    public String delete(int id) {
        return employeeRepository.delete(id);
    }

}
