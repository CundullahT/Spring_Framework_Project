package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

public class Selenium implements Course {
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 22");
    }
}
