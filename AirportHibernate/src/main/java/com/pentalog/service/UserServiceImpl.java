package com.pentalog.service;

import com.pentalog.model.UserEntity;
import com.pentalog.repository.UserRepositoryImpl;
import com.pentalog.repository.api.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl {

    @Resource
    private UserRepositoryImpl userRepository;

    public UserEntity createUser(String fname, String lname, String birthDate) {
        UserEntity userEntity = new UserEntity(fname, lname, birthDate);
        return userRepository.create(userEntity);
    }

    public void deleteUser(String name) {
        userRepository.deleteUser(name);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
