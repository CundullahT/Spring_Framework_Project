package com.cybertek;

import com.cybertek.repository.DepartmentRepository;
import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedqueryApplication {

    @Autowired
    RegionRepository regionRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DerivedqueryApplication.class, args);
    }

    @PostConstruct
    public void testRegions(){

        System.out.println("----------Region Start----------");

        System.out.println("regionRepository.findByCountry(\"Canada\") = " + regionRepository.findByCountry("Canada"));
        System.out.println("regionRepository.findDistinctByCountry(\"Canada\") = " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("regionRepository.findByCountryContaining(\"United\") = " + regionRepository.findByCountryContaining("United"));
        System.out.println("regionRepository.findByCountryContainingOrderByRegion(\"United\") = " + regionRepository.findByCountryContainingOrderByRegion("United"));
        System.out.println("regionRepository.findTop2ByCountry(\"United States\") = " + regionRepository.findTop2ByCountry("United States"));

        System.out.println("-----------Region End-----------");

    }

    @PostConstruct
    public void testDeparments(){

        System.out.println("----------Department Start----------");

        System.out.println("departmentRepository.findByDepartment(\"Furniture\") = " + departmentRepository.findByDepartment("Furniture"));
        System.out.println("departmentRepository.findByDivision(\"Health\") = " + departmentRepository.findByDivision("Health"));
        System.out.println("departmentRepository.findByDivisionIs(\"Health\") = " + departmentRepository.findByDivisionIs("Health"));
        System.out.println("departmentRepository.findByDivisionEquals(\"Health\") = " + departmentRepository.findByDivisionEquals("Health"));
        System.out.println("departmentRepository.findByDivisionEndingWith(\"ics\") =" + departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("departmentRepository.findDistinctTop3ByDivisionContaining(\"Hea\") = " + departmentRepository.findDistinctTop3ByDivisionContaining("Hea"));

        System.out.println("-----------Department End-----------");

    }
    }

