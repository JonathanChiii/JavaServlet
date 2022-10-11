package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
    String save(Employee e);
    void update(Employee e);
    List<Employee> getAllData();
    Employee getById(int id);
    String delete(int id);
}
