package edu.miu.cs.cs425.adidasler.Service;

import edu.miu.cs.cs425.adidasler.model.Athlete;

import java.util.List;

public interface AthleteService {
    public abstract List<Athlete> getAthletes();
    public abstract void saveAthlete(Athlete athlete);
    public abstract List<Athlete> getEliteAthletes();
}
