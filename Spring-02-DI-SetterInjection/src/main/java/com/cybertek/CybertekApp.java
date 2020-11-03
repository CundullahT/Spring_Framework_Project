package com.cybertek;

import com.cybertek.interfaces.Course;
import com.cybertek.services.Selenium;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = (Course) container.getBean("java");     //  Course course = container.getBean("java",Course.class);     --->    This will work too.

        course.getTeachingHours();

    }

}
