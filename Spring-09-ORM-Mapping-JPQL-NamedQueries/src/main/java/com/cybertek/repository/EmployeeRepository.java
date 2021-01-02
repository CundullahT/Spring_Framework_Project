package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
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

    // Single Named Parameter
    @Query("SELECT e FROM Employee e WHERE e.salary = :salary")
    Employee getEmployeeBySalary(@Param("salary") int salary);

    // Multiple Named Parameters
    @Query("SELECT e FROM Employee e WHERE e.firstName = :name OR e.salary = :salary")
    List<Employee> getEmployeeByFirstNameOrSalary(@Param("name") String name, @Param("salary") int salary);

    // Not Equal
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1")
    List<Employee> getEmployeeBySalaryNotEqual(int salary);

    // Like - Contains - StartsWith - EndsWith
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee> getEmployeeByFirstNameLike(String pattern);

    // Less Than
    @Query("SELECT e FROM Employee e WHERE e.salary < ?1")
    List<Employee> getEmployeeBySalaryLessThan(int salary);

    // Greater Than
    @Query("SELECT e FROM Employee e WHERE e.salary > ?1")
    List<Employee> getEmployeeBySalaryGreaterThan(int salary);

    // Between
    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> getEmployeeBySalaryBetween(int salary1, int salary2);

    // Before
    @Query("SELECT e FROM Employee e WHERE e.hireDate > ?1")
    List<Employee> getEmployeeByHireDateBefore(LocalDate date);

    // After
    @Query("SELECT e FROM Employee e WHERE e.hireDate < ?1")
    List<Employee> getEmployeeByHireDateAfter(LocalDate date);

    // Null
    @Query("SELECT e FROM Employee e WHERE e.email IS NULL ")
    List<Employee> getEmployeeByEmailIsNull();

    // Not Null
    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL ")
    List<Employee> getEmployeeByEmailIsNotNull();

    // Sort Salary In Ascending Order
    @Query("SELECT e FROM Employee e ORDER BY e.salary")
    List<Employee> getEmployeeBySalaryOrderByAsc();

    // Sort Salary In Descending Order
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC")
    List<Employee> getEmployeeBySalaryOrderByDesc();

    // Native Query
    @Query(value = "SELECT * FROM employees WHERE salary = ?1", nativeQuery = true)
    List<Employee> readEmployeeBySalary(int salary);

}
