package edu.miu.cs.cs425.adidasler.controller;

import edu.miu.cs.cs425.adidasler.Service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class Athletecontroller {
    @Autowired
    AthleteService athleteService;

        @GetMapping(value = {"/adidasler/athlete","/athlete"})
        public ModelAndView displayListOfAthletes() {
            var modelAndView = new ModelAndView();
            modelAndView.addObject("athletes",athleteService.getAthletes() );
            modelAndView.setViewName("secured/list");
            return modelAndView;
        }




}
