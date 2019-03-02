package com.pentalog.repository.api;

import com.pentalog.model.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

UserEntity create (UserEntity userToCreate);
void save(UserEntity u1);
void readUser();
void deleteUser(String name);
UserEntity searchUser(String fname);
}
