package com.example.makeMyTrip.Controllers;

import com.example.makeMyTrip.DTOS.RequestDTO.AddTransportDTO;
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


@PostMapping("/addTransport")
public ResponseEntity addTransport(@RequestBody AddTransportDTO addTransportDTO){

    try{
       String Result=transportService.addtransport(addTransportDTO);
       return new ResponseEntity(Result,HttpStatus.OK);
    }catch (Exception exception){
        return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_REQUEST);
    }
}

    @PutMapping("/SearchFlight")
    public ResponseEntity getTransport(@RequestBody SearchFlightDTO searchFlightDTO){

        List<FlightDTO> flightResult=transportService.SerachResult(searchFlightDTO);

        return new ResponseEntity(flightResult, HttpStatus.OK);
    }
}
