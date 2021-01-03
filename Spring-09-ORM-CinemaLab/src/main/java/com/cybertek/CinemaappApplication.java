package com.cybertek;

import com.cybertek.repository.AccountRepository;
import com.cybertek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CinemaappApplication {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(CinemaappApplication.class, args);
    }

    @PostConstruct
    public void test(){

        System.out.println("accountRepository.fetchAdminUsers() = " + accountRepository.fetchAdminUsers());
        System.out.println("userRepository.findAllByAccountNameContaining(\"osie\") = " + userRepository.findAllByAccountNameContaining("osie"));

    }

}
