package com.example.makeMyTrip.Controllers;

import com.example.makeMyTrip.DTOS.RequestDTO.addFlightseatsDTO;
import com.example.makeMyTrip.Services.SeatServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class SeatController {
@Autowired
    SeatServices seatServices;
    @PostMapping("/addSeat")
    public String addFlightSeat(@RequestBody addFlightseatsDTO addFlightseatsDTO){

        return seatServices.addSeat(addFlightseatsDTO);
    }
}
