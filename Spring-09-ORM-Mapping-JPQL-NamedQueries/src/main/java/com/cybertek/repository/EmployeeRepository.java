package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e WHERE e.email = 'dtrail8@tamu.edu'")
    Employee getEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email = 'dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

    // Single Bind Parameter
    @Query("SELECT e FROM Employee e WHERE e.email = ?1")
    Optional<Employee> getEmployeeByEmail(String email);    // Optional is for getting rid of the NullPointerException

    // Multiple Bind Parameter
    @Query("SELECT e FROM Employee e WHERE e.email = ?1 AND e.salary = ?2")
    Employee getEmployeeByEmailAndSalary(String email, int salary);

}
