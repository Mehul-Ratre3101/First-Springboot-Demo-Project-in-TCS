package com.example.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Employee.model.employee;

@Repository
public interface employee_repository extends JpaRepository<employee,Long> {
}