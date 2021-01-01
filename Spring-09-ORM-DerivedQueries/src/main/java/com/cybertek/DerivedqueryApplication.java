package com.cybertek;

import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedqueryApplication {

    @Autowired
    RegionRepository regionRepository;

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

}
