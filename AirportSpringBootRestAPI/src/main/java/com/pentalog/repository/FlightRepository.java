package com.pentalog.repository;

import com.pentalog.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,String> {

}
