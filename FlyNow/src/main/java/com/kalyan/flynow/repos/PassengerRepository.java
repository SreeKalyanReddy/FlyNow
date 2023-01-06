package com.kalyan.flynow.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalyan.flynow.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
