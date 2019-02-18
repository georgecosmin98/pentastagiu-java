package com.pentalog.service;

import com.pentalog.model.FlightEntity;
import com.pentalog.model.UserEntity;
import com.pentalog.repository.FlightRepositoryImpl;
import com.pentalog.repository.UserRepositoryImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pentalog.repository.api.FlightRepository;
import com.pentalog.repository.api.UserRepository;

import javax.annotation.Resource;

@Service
@Transactional
public class FlightServiceImpl {
    @Resource
    private FlightRepositoryImpl flightRepository;

    @Resource
    private UserRepositoryImpl userRepository;

    public FlightEntity createFlight(String flightName, String destination, String departureDate, String flightDuration, int maxUsercapacity) {
        FlightEntity newFlight = new FlightEntity(flightName,destination,departureDate,flightDuration,maxUsercapacity);
        return flightRepository.create(newFlight);
    }

    public UserEntity createUser(String fname, String lname, String birthDate) {
        UserEntity userEntity = new UserEntity(fname, lname, birthDate);
        return userRepository.create(userEntity);
    }


    public UserRepository getUserRepository() {
        return userRepository;
    }

    public FlightRepository getFlightRepository(){
        return flightRepository;
    }
}
