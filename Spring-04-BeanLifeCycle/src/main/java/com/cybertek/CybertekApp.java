package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java", Course.class);

        course.getTeachingHours();

        ((ClassPathXmlApplicationContext)container).close();        //      If we want to execute destroyMethod we need to close the container and
                                                                    //      since close method is coming from ClassPathXmlApplicationContext we need to cast it.
    }

}
