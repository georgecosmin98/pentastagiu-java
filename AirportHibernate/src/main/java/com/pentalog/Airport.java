package com.pentalog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.pentalog.service.FlightServiceImpl;

public class Airport {

    public static void main(String[] args) {

        ApplicationContext contex =  new FileSystemXmlApplicationContext("D:\\AirportHibernate\\src\\main\\resources\\airport-application-context.xml");

        FlightServiceImpl flightManager = (FlightServiceImpl) contex.getBean(FlightServiceImpl.class);

        flightManager.createFlight("F112","Barcelona","29/10/2019","3200",32);
        flightManager.getFlightRepository().readFlight();
        flightManager.deleteFlight("F112");
    }
}
