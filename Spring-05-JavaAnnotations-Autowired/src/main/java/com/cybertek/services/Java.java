package com.cybertek.services;

import com.cybertek.interfaces.Course;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java implements Course {           //  Constructor injection

    @Autowired
    private OfficeHours officeHours;

//  //  @Autowired
//    public Java(OfficeHours officeHours){
//        this.officeHours=officeHours;
//    }


    public OfficeHours getOfficeHours() {
        return officeHours;
    }

//    @Autowired
//    public void setOfficeHours(OfficeHours officeHours) {       //  Setter Injection
//        this.officeHours = officeHours;
//    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (30 + officeHours.getHours()));
    }
}
