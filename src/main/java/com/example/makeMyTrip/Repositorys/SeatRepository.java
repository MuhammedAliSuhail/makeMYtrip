package com.example.makeMyTrip.Repositorys;

import com.example.makeMyTrip.Entites.Seats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SeatRepository extends JpaRepository<Seats,Integer> {


}
