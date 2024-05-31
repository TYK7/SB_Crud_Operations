package com.tyk.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tyk.model.Employee;

@Repository
public interface EmployeeRepositary extends CrudRepository<Employee, Integer> {

}
