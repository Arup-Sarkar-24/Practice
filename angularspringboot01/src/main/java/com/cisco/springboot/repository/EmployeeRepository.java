package com.cisco.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cisco.springboot.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	

}
