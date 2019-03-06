package com.pentalog.controller;

import com.pentalog.model.Flight;
import com.pentalog.model.User;
import com.pentalog.repository.FlightRepository;
import com.pentalog.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class FlightController {

    @Resource
    private FlightRepository flightRepository;

    @Resource
    private UserRepository userRepository;

    @GetMapping("/flights")
    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }

    @PostMapping("/flights")
    @ResponseStatus(HttpStatus.CREATED)
    public Flight addFlight(@RequestBody Flight flight) {
        return flightRepository.save(flight);
    }

    @GetMapping("/flights/{id}")
    public Flight getFlight(@PathVariable String id) {
        return flightRepository.findById(id).orElse(null);
    }

    @PutMapping("/flights/{id}")
    public Flight updateFlight(@RequestBody Flight flight, @PathVariable String id) {
        Flight dbFlight = flightRepository.findById(id).orElse(null);
        if (dbFlight != null && flight.getPassengers().size() > 0) {
            flight.getPassengers().forEach(passenger -> {
                User user = userRepository.findById(passenger.getId()).orElse(null);
                if (user != null)
                    dbFlight.getPassengers().add(user);
            });
            //  dbFlight.setName(flight.getName());
            return flightRepository.save(dbFlight);
        }
        return null;
    }

    @DeleteMapping("/flights/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFlight(@PathVariable String id) {
        flightRepository.deleteById(id);
    }
}
