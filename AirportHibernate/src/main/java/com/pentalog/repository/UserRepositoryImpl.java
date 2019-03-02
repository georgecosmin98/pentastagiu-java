package com.pentalog.repository;

import com.pentalog.model.UserEntity;
import com.pentalog.repository.api.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UserEntity create(UserEntity userToCreate) {
        entityManager.persist(userToCreate);
        return userToCreate;
    }

    @Override
    public void save(UserEntity u1) {
        this.entityManager.merge(u1);
    }

    @Override
    public void readUser() {
        Query query = this.entityManager.createQuery("select usr from UserEntity usr");
        System.out.println((UserEntity) query.getSingleResult());
    }

    @Override
    public void deleteUser(String name) {


        Query query = this.entityManager.createQuery("select usr from UserEntity usr where usr.name = :name");
        query.setParameter("name", name);
        entityManager.remove(query.getSingleResult());

    }

    @Override
    public UserEntity searchUser(String fname) {
        Query query = this.entityManager.createQuery("select u1 from UserEntity u1 where fname=:fname");
        query.setParameter("fname", fname);
        return (UserEntity) query.getSingleResult();
    }
}
