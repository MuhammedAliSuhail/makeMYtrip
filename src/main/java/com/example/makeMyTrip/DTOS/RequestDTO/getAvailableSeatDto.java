package com.example.makeMyTrip.DTOS.RequestDTO;

import lombok.Data;

import java.time.LocalDate;
@Data
public class getAvailableSeatDto {
    private LocalDate journyDate;
    private int transportID;
}
