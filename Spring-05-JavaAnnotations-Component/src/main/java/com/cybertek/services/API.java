package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {                //  If class name is all capital letters then we need to pass id as all capital letters.
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 15");
    }
}
