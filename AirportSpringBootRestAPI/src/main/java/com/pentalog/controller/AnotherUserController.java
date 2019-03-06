package com.pentalog.controller;

import com.pentalog.Service.api.UserService;
import com.pentalog.model.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/flights")
public class AnotherUserController {

    @Resource
    UserService userService;

    @GetMapping("/{flightId}/users")
    public Set<User> getAllUsers(@PathVariable String flightId){
       return userService.getAllUsers(flightId);

    }

    @PostMapping("/{flightId}/users")
    public User addPassenger(@PathVariable String flightId,@RequestBody User user){
       return userService.addPassenger(flightId,user);
    }
}
