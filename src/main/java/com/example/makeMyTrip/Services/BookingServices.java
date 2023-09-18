package com.example.makeMyTrip.Services;

import com.example.makeMyTrip.DTOS.RequestDTO.getAvailableSeatDto;
import com.example.makeMyTrip.DTOS.ResponseDto.AvailableResposeDTO;
import com.example.makeMyTrip.Entites.Bookings;
import com.example.makeMyTrip.Entites.Transport;
import com.example.makeMyTrip.Entites.Users;
import com.example.makeMyTrip.Repositorys.BookingRepository;
import com.example.makeMyTrip.Repositorys.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

@Service
public class BookingServices {

//@Autowired
//    private BookingRepository bookingRepository;
//@Autowired
//private TransportService transportService;
//
//@Autowired
//private TransportRepository transportRepository;
//
//@Autowired
//    private Users users;

//public List<AvailableResposeDTO> getAvailableSeats(getAvailableSeatDto getAvailableSeatDto){
//
//
//    List<Bookings> bookingsList=bookingRepository.findBooking(getAvailableSeatDto.getJournyDate(),getAvailableSeatDto.getTransportID());
//    TreeSet<String> bookedSeats=new TreeSet<>();
//    for(Bookings bookings:bookingsList){
//           String str=bookings.getSeatNo();
//        String [] seatBookings=str.split(",");
//
//        for(String seat:seatBookings){
//            bookedSeats.add(seat);
//        }
//    }
//
//    return
//
//}

}
