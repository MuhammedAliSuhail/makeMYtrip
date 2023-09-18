package com.example.makeMyTrip.DTOS.RequestDTO;

import com.example.makeMyTrip.Entites.Transport;
import lombok.Data;

@Data
public class addFlightseatsDTO {

private Integer noOfEconamySeats;
private Integer noOFBussinesSeats;
private Integer priceOfEconnamySeat;
private Integer priceOfBusinessSeat;

private Integer transportId;
}
