package com.cybertek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cybertek.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
