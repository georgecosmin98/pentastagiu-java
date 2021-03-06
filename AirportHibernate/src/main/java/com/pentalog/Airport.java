package com.pentalog;

import com.pentalog.service.FlightServiceImpl;
import com.pentalog.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.time.LocalDate;
import java.util.Date;

public class Airport {

    public static void main(String[] args) {

        ApplicationContext contex = new FileSystemXmlApplicationContext("D:\\AirportHibernate\\src\\main\\resources\\airport-application-context.xml");

        FlightServiceImpl flightManager = (FlightServiceImpl) contex.getBean(FlightServiceImpl.class);
        UserServiceImpl userManager = (UserServiceImpl) contex.getBean(UserServiceImpl.class);

        //System.out.println(flightManager.getFlightRepository().searchFlight("F112").getUserList());
    }
}
