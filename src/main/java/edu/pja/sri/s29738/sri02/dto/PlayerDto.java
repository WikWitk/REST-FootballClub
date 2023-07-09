package edu.pja.sri.s29738.sri02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PlayerDto {
    private Long id;
    private String firstName;
    private String lastname;
    private LocalDate birthDate;
    private String position;
    private String club;

}
