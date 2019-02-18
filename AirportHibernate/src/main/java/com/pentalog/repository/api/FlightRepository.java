package com.pentalog.repository.api;

import com.pentalog.model.FlightEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface FlightRepository {

    FlightEntity create(FlightEntity flightToCreate);
    void save(FlightEntity fl);
    void readFlight();
    void deleteFlight(String name);

}
