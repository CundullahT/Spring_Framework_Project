package com.cybertek.service;

import com.cybertek.implementation.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Part Time Mentor Account is created...");
    }
}
