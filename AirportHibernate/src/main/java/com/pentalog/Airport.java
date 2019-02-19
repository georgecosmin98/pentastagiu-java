package com.pentalog;

import com.pentalog.model.FlightEntity;
import com.pentalog.repository.FlightRepositoryImpl;
import com.pentalog.repository.UserRepositoryImpl;
import com.pentalog.repository.api.FlightRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.pentalog.service.FlightServiceImpl;

public class Airport {

    public static void main(String[] args) {

        ApplicationContext contex =  new FileSystemXmlApplicationContext("D:\\AirportHibernate\\src\\main\\resources\\airport-application-context.xml");

        FlightServiceImpl flightManager = (FlightServiceImpl) contex.getBean(FlightServiceImpl.class);

        FlightRepositoryImpl flightRepository = contex.getBean(FlightRepositoryImpl.class);

        flightRepository.readFlight();
        flightRepository.deleteFlight("F112");
        flightRepository.readFlight();
    }
}
