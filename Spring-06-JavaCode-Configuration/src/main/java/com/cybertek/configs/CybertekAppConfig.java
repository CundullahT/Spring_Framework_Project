package com.cybertek.configs;

import com.cybertek.interfaces.ExtraSessions;
import com.cybertek.services.Java;
import com.cybertek.services.OfficeHours;
import com.cybertek.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cybertek")
@PropertySource("classpath:application.properties")
public class CybertekAppConfig {

    @Bean                           //      --->        If we shouldn't touch the other class we can use @Bean annotation instead of putting @Component in the other class,
    public Java java(){             //      --->        but @Bean is a method level annotation while @Component is a class level annotation.
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

//    @Bean
//    public OfficeHours officeHours(){
//        return new OfficeHours();
//    }

//    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }

}
