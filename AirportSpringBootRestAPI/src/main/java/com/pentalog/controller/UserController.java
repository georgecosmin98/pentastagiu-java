package com.pentalog.controller;

import com.pentalog.model.User;
import com.pentalog.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Resource
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
         return userRepository.save(user);
    }

    @GetMapping("/users/{id}")
    public User getUserFlights(@PathVariable String id) {
        return userRepository.findById(id).orElse(null);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user,@PathVariable String id) {
        User dbFlight = userRepository.findById(id).orElse(null);
        if(dbFlight != null){
            dbFlight.setFname(user.getFname());
            return userRepository.save(dbFlight);
        }
        return null;
    }

    @DeleteMapping("/users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
    }
}
