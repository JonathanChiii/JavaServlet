package com.demo.repository;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeRepository {
    String save(Employee e);
    void update(Employee e);
    List<Employee> getAllData();
    Employee getById(int id);
    String delete(int id);
}