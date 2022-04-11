package edu.miu.cs.cs425.adidasler.controller;

import edu.miu.cs.cs425.adidasler.Service.AthleteService;
import edu.miu.cs.cs425.adidasler.model.Athlete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
   public class EliteController {
    @Autowired
    private AthleteService athleteService;
        @GetMapping(value = {"/adidasler/elite","/elite"})
        public List<Athlete> displayListOfEliteAthletes() {
            return athleteService.getEliteAthletes();
            }

}
