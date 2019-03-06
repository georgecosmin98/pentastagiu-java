package com.pentalog.service;

import com.pentalog.FlightStatus;
import com.pentalog.model.FlightEntity;
import com.pentalog.model.UserEntity;
import com.pentalog.repository.FlightRepositoryImpl;
import com.pentalog.repository.api.FlightRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@Service
@Transactional
public class FlightServiceImpl {

    @Resource
    private FlightRepositoryImpl flightRepository;


    public FlightEntity createFlight(String flightName, String destination, Date departureDate, int flightDuration, int maxUsercapacity, FlightStatus status) {
        FlightEntity newFlight = new FlightEntity(flightName, destination, departureDate, flightDuration, maxUsercapacity, status);
        return flightRepository.create(newFlight);
    }


    public void deleteFlight(String name) {
        flightRepository.deleteFlight(name);
    }

    public void addUserToFlight(UserEntity user, String flightName) {
        FlightEntity flightEntity = flightRepository.searchFlight(flightName);
        if (flightEntity.getUserList().size() < flightEntity.getMaxUserCapacity())
        {
            flightEntity.getUserList().add(user);
            flightRepository.save(flightEntity);
        }
        else
            System.out.println("Sorry! The plane has reached it's maximum transport capacity!");
    }


    public FlightRepository getFlightRepository() {
        return flightRepository;
    }
}
