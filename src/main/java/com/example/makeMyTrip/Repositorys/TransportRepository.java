package com.example.makeMyTrip.Repositorys;

import com.example.makeMyTrip.Entites.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TransportRepository extends JpaRepository<Transport,Integer> {
}
