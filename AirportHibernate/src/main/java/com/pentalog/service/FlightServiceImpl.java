package com.pentalog.service;

import com.pentalog.model.FlightEntity;
import com.pentalog.repository.FlightRepositoryImpl;
import com.pentalog.repository.api.FlightRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class FlightServiceImpl {

    @Resource
    private FlightRepositoryImpl flightRepository;


    public FlightEntity createFlight(String flightName, String destination, String departureDate, String flightDuration, int maxUsercapacity) {
        FlightEntity newFlight = new FlightEntity(flightName, destination, departureDate, flightDuration, maxUsercapacity);
        return flightRepository.create(newFlight);
    }


    public void deleteFlight(String name) {
        flightRepository.deleteFlight(name);
    }

    public FlightRepository getFlightRepository() {
        return flightRepository;
    }
}
