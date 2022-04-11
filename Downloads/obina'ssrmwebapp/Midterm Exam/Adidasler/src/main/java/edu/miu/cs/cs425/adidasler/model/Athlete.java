package edu.miu.cs.cs425.adidasler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Athletes")
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long athleteId;

    @Column(nullable = false, unique = true)
    private Integer ssn;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = true)
    private String phoneNumber;



    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfRegistration;

    @Column(nullable = false)
    private Integer totalNumberOfMedalsWon;

    @Column(nullable = false)
    private Double monthlySalary;

    @Email
    @Column(nullable = true)
    private String emailAddress;

    public boolean isElite() {
        return ((this.dateOfRegistration.isBefore(LocalDate.now().minusYears(5l)) ||
                this.dateOfRegistration.isEqual(LocalDate.now().minusYears(5l)))&& this.totalNumberOfMedalsWon>=3);

    }
}
