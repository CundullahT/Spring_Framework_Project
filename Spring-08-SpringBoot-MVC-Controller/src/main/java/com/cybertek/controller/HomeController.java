package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/ozzy")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/ozzy")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("/spring")
    public String getMappingEx(){
        return "home";
    }

    @PostMapping("/spring")
    public String postMappingEx(){
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("name is " + name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx2(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("name is " + name);
        System.out.println("email is " + email);
        return "home";
    }

}
