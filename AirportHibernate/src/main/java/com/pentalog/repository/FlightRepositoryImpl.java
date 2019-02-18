package com.pentalog.repository;

import com.pentalog.model.FlightEntity;
import com.pentalog.repository.api.FlightRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.SQLDelete;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.*;

import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Component("flightRepositoryImpl")
@Service
public class FlightRepositoryImpl implements FlightRepository {
    @PersistenceContext
    private EntityManager entityManager;

    private static SessionFactory factory;

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

    public void searchFlight(String name){
        Query query = this.entityManager.createQuery("select f1 from FlightEntity f1 where flightName=:name");
        query.setParameter("name",name);

        System.out.println((FlightEntity) query.getSingleResult());
    }


    @Override
    public void deleteFlight(String name) {
//        Session session = factory.openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//            FlightEntity flightEntity = (FlightEntity) session.get(FlightEntity.class, name);
//            session.delete(flightEntity);
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }

        Query query = this.entityManager.createQuery("select fl from FlightEntity fl where fl.name = :name");
        query.setParameter("name", name);
        entityManager.remove(query.getSingleResult());

    }
    }

