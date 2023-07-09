package edu.pja.sri.s29738.sri02.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Player {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Long id;

    private String firstName;

    private String lastName;
    private LocalDate birthDate;
    private String position;
    private String club;

}
