package edu.miu.cs.cs425.adidasler.Repository;

import edu.miu.cs.cs425.adidasler.model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepository extends JpaRepository<Athlete,Long> {
}
