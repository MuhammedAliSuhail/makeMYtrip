package com.example.makeMyTrip.DTOS.ResponseDto;

import com.example.makeMyTrip.Enums.seatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AvailableResposeDTO {
private String seatNo;
private seatType seatType;

private  Integer seatPrice;
}
