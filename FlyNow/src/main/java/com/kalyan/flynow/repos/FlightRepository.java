package com.kalyan.flynow.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalyan.flynow.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
