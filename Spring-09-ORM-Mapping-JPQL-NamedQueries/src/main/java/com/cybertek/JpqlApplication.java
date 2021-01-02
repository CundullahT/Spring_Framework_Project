package com.cybertek;

import com.cybertek.repository.DepartmentRepository;
import com.cybertek.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class JpqlApplication {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpqlApplication.class, args);
    }

    @PostConstruct
    public void testEmployee(){

        System.out.println("employeeRepository.getEmployeeDetail() = " + employeeRepository.getEmployeeDetail());
        System.out.println("employeeRepository.getEmployeeSalary() = " + employeeRepository.getEmployeeSalary());

        if(employeeRepository.getEmployeeByEmail("bhendricksi@privacy.gov.au").isPresent()) {
            System.out.println("employeeRepository.getEmployeeByEmail(\"bhendricksi@privacy.gov.au\").get() = " + employeeRepository.getEmployeeByEmail("bhendricksi@privacy.gov.au").get());
        }

        System.out.println("----------Employee Start----------");
        System.out.println("employeeRepository.getEmployeeByEmailAndSalary(\"bhendricksi@privacy.gov.au\", 158268) = " + employeeRepository.getEmployeeByEmailAndSalary("bhendricksi@privacy.gov.au", 158268));
        System.out.println("employeeRepository.getEmployeeBySalary(114983) = " + employeeRepository.getEmployeeBySalary(114983));
        System.out.println("employeeRepository.getEmployeeByFirstNameOrSalary(\"Jessey\", 124949) = " + employeeRepository.getEmployeeByFirstNameOrSalary("Jessey", 124949));
        System.out.println("employeeRepository.getEmployeeBySalaryNotEqual(80000) = " + employeeRepository.getEmployeeBySalaryNotEqual(80000));
        System.out.println("employeeRepository.getEmployeeByFirstNameLike(\"ab\") = " + employeeRepository.getEmployeeByFirstNameLike("ab"));
        System.out.println("employeeRepository.getEmployeeBySalaryLessThan(80000) = " + employeeRepository.getEmployeeBySalaryLessThan(80000));
        System.out.println("employeeRepository.getEmployeeBySalaryGreaterThan(80000) = " + employeeRepository.getEmployeeBySalaryGreaterThan(80000));
        System.out.println("employeeRepository.getEmployeeBySalaryBetween(80000, 10000) = " + employeeRepository.getEmployeeBySalaryBetween(80000, 10000));
        System.out.println("employeeRepository.getEmployeeByHireDateBefore(LocalDate.now()) = " + employeeRepository.getEmployeeByHireDateBefore(LocalDate.now()));
        System.out.println("employeeRepository.getEmployeeByHireDateAfter(LocalDate.now().minusYears(5)) = " + employeeRepository.getEmployeeByHireDateAfter(LocalDate.now().minusYears(5)));
        System.out.println("employeeRepository.getEmployeeByEmailIsNull() = " + employeeRepository.getEmployeeByEmailIsNull());
        System.out.println("employeeRepository.getEmployeeByEmailIsNotNull() = " + employeeRepository.getEmployeeByEmailIsNotNull());
        System.out.println("employeeRepository.getEmployeeBySalaryOrderByAsc() = " + employeeRepository.getEmployeeBySalaryOrderByAsc());
        System.out.println("employeeRepository.getEmployeeBySalaryOrderByDesc() = " + employeeRepository.getEmployeeBySalaryOrderByDesc());
        System.out.println("-----------Employee End-----------");

        System.out.println("----------Department Start----------");
        System.out.println(departmentRepository.getDepartmentByDivisionIn(Arrays.asList("Health", "Kids", "Home")));
        System.out.println("-----------Department End-----------");

    }

}
