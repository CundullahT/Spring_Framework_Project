package com.cybertek.service;

import com.cybertek.implementation.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor Account is created...");
    }
}
