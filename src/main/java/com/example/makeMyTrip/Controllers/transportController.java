package com.example.makeMyTrip.Controllers;

import com.example.makeMyTrip.DTOS.RequestDTO.SearchFlightDTO;
import com.example.makeMyTrip.DTOS.ResponseDto.FlightDTO;
import com.example.makeMyTrip.Services.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transport")
public class transportController {

@Autowired
    TransportService transportService;

    @PutMapping("/SearchFlight")
    public ResponseEntity getTransport(@RequestBody SearchFlightDTO searchFlightDTO){

        List<FlightDTO> flightResult=transportService.SerachResult(searchFlightDTO);

        return new ResponseEntity(flightResult, HttpStatus.OK);
    }
}
