package com.pentalog.repository.api;

import com.pentalog.model.FlightEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightRepository {

    FlightEntity create(FlightEntity flightToCreate);
    void save(FlightEntity fl);
    void readFlight();
    void deleteFlight(String name);

}
