package com.gitDveloper3.ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gitDveloper3.ems.Models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
