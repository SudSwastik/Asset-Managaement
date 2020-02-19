package com.sudarshan.sud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sudarshan.sud.entities.Employee;

@Service
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
