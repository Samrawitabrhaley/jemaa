package edu.miu.cs.cs425.adidasler.Service.Impl;

import edu.miu.cs.cs425.adidasler.Repository.AthleteRepository;
import edu.miu.cs.cs425.adidasler.Service.AthleteService;
import edu.miu.cs.cs425.adidasler.model.Athlete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AthleteServiceImpl implements AthleteService {
    @Autowired
    private AthleteRepository athleteRepository;
    @Override
    public List<Athlete> getAthletes() {
        return athleteRepository.findAll(Sort.by("fullName"));
    }

    @Override
    public void saveAthlete(Athlete athlete) {
        athleteRepository.save(athlete);

    }

    @Override
    public List<Athlete> getEliteAthletes() {
        return athleteRepository.findAll(Sort.by("fullName")).stream().filter(Athlete::isElite).collect(Collectors.toList());
    }
}
