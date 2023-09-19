package com.example.makeMyTrip.Repositorys;

import com.example.makeMyTrip.Entites.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface BookingRepository extends JpaRepository<Bookings,Integer> {
@Query(value = "select * from Bookings where JournyDate=:journyDateInput and TransportId=:TransportIdInput",nativeQuery = true)
List<Bookings> findBooking(LocalDate journyDateInput, Integer TransportIdInput);
}
