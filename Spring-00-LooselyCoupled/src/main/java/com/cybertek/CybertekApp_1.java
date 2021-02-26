package com.cybertek;

import com.cybertek.service.FullTimeMentor;
import com.cybertek.service.MentorAccount;
import com.cybertek.service.PartTimeMentor;

public class CybertekApp_1 {

    public static void main(String[] args) {

        //FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(partTime);

        mentor.manageAccount();

    }

}
