package com.cybertek.controller;

import com.cybertek.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model){

        model.addAttribute("mentor", new Mentor());

        List<String> batchList = Arrays.asList("B1","B2","B3","B4","B5","B6","B7","B8","B9","B10","EU1","EU2","EU3","EU4");
        model.addAttribute("batchList", batchList);

        return "mentor/mentor-register";

    }

}
