package com.wildwodeschool.docProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String wh(){
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String dt(){
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String jw(){
        return "Jodie Whittaker";
    }
}
