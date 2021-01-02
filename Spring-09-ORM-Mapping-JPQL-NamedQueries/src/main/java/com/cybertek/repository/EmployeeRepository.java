package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Display all employees with email address 'bhendricksi@privacy.gov.au'
    List<Employee> findByEmail(String email);

    // Display all employees with first name 'Benn' and last name 'Dudley', also show all employees with an email address 'bhendricksi@privacy.gov.au'
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    // Display all employees that first name is not 'Cayla'
    List<Employee> findByFirstNameIsNot(String firstname);

    // Display all employees where last name starts with 'Za'
    List<Employee> findByLastNameStartingWith(String lastNameStarting);

    // Display all employees with salaries higher than '80000'
    List<Employee> findBySalaryGreaterThan(Integer salary);

    // Display all employees with salaries less than '80000'
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    // Display all employees that has been hired between '2010,6,1' and '2013,12,30'
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    // Display all employees where salaries greater and equal to '80000' in order
    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    // Display top unique 3  employees that is making less than '80000'
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    // Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

}
