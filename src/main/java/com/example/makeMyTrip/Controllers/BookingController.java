package com.example.makeMyTrip.Controllers;

import com.example.makeMyTrip.DTOS.RequestDTO.getAvailableSeatDto;
import com.example.makeMyTrip.DTOS.ResponseDto.AvailableResposeDTO;
import com.example.makeMyTrip.Services.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Booking")
public class BookingController {

@Autowired
    BookingServices bookingServices;
    @PostMapping("/getAvailableSeats")
    public ResponseEntity getAvailableSeatS(@RequestBody getAvailableSeatDto getAvailableSeatDto){


        List<AvailableResposeDTO> result=bookingServices.getAvailableSeats(getAvailableSeatDto);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
