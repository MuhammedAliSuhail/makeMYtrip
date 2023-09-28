package com.example.makeMyTrip.Repositorys;

import com.example.makeMyTrip.Entites.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

}
