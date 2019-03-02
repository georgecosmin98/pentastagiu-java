package com.pentalog.repository;

import com.pentalog.model.FlightEntity;
import com.pentalog.repository.api.FlightRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.*;

@Repository
public class FlightRepositoryImpl implements FlightRepository {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public FlightEntity create(FlightEntity flightToCreate) {
        entityManager.persist(flightToCreate);
        return flightToCreate;
    }

    @Override
    public void save(FlightEntity fl) {
        this.entityManager.merge(fl);
    }

    @Override
    public void readFlight() {
        Query query = this.entityManager.createQuery("select fl from FlightEntity fl");
        System.out.println((FlightEntity) query.getSingleResult());
    }

    public FlightEntity searchFlight(String name){
        Query query = this.entityManager.createQuery("select f1 from FlightEntity f1 where flightName=:name");
        query.setParameter("name",name);
        return (FlightEntity) query.getSingleResult();
    }


    @Override
    public void deleteFlight(String name) {


        Query query = this.entityManager.createQuery("select fl from FlightEntity fl where fl.name = :name");
        query.setParameter("name", name);
        entityManager.remove(query.getSingleResult());

    }
    }

