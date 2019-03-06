package com.pentalog.Service;

import com.pentalog.Service.api.UserService;
import com.pentalog.model.Flight;
import com.pentalog.model.User;
import com.pentalog.repository.FlightRepository;
import com.pentalog.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private FlightRepository flightRepository;

    @Resource
    private UserRepository userRepository;

    @Override
    public Set<User> getAllUsers(String flightId) {
        Flight flight = flightRepository.findById(flightId).orElse(null);
        if (flight != null) {
            return flight.getPassengers();
        }
        return null;
    }

    @Override
    public User addPassenger(String flightId, User user) {
        Flight flight = flightRepository.findById(flightId).orElse(null);
        if (flight != null){
            User dbUser = userRepository.save(user);
            flight.getPassengers().add(dbUser);
            flightRepository.save(flight);
            return user;
        }
        return null;
    }
}
