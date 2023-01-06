package com.kalyan.flynow.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalyan.flynow.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
