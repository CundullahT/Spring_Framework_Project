package com.cybertek.repository;

import com.cybertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    // Display all divisions in the Furniture Department
    List<Department> findByDepartment(String department);

    // Display all departments in the Health Division
    List<Department> findByDivision(String division);

    // Display all departments in the Health Division
    List<Department> findByDivisionIs(String division);

    // Display all departments in the Health Division
    List<Department> findByDivisionEquals(String division);

    // Display all departments with division name ends with 'ics'
    List<Department> findByDivisionEndingWith(String divisionEnding);

    // Display top 3 departments with division name includes 'Hea', without duplicates
    List<Department> findDistinctTop3ByDivisionContaining(String divisionContaining);

}
