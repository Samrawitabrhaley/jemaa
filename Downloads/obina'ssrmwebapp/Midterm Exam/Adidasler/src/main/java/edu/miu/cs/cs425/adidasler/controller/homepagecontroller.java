package edu.miu.cs.cs425.adidasler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homepagecontroller {
    @GetMapping(value = {"/","/adidasler/home","home"})
    public String Homepage(){
        return "home/index";

    }


}
