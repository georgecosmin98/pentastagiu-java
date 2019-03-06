package com.pentalog.Service.api;

import com.pentalog.model.User;

import java.util.Set;

public interface UserService {
   Set<User> getAllUsers(String flightId);

    User addPassenger(String flightId, User user);
}
