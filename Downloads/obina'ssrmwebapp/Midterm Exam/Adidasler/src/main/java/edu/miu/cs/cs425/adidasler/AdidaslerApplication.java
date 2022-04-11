package edu.miu.cs.cs425.adidasler;

import edu.miu.cs.cs425.adidasler.Service.AthleteService;
import edu.miu.cs.cs425.adidasler.model.Athlete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class AdidaslerApplication  {

    public static void main(String[] args) {
        SpringApplication.run(AdidaslerApplication.class, args);
    }

    }

