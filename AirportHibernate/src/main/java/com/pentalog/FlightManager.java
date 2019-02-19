package com.pentalog;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FlightManager {
    private List<Flight> flightList = new ArrayList();
    private List<User> userList = new ArrayList();

    // Flight Methods

    public void addFlight(Flight flight) {
        for (Flight f : flightList) {
            if (flight.getName().equals(f.getName())) {
                System.out.println("This flight already exists");
                return;
            }
        }
        flightList.add(flight);
    }

    public void deleteFlight(Flight flight) {
        if (flightList.size() == 0) {
            System.out.println("Error! \nFlight list is empty!");
            return;
        }
        Iterator<Flight> flightIterator = flightList.iterator();
        while (flightIterator.hasNext()) {
            Flight f = flightIterator.next();
            if (f.getName().equals(flight.getName())) {
                flightIterator.remove();
                System.out.println("Flight " + f.getName() + " has been deleted!");
                return;
            }
        }
        System.out.println("Flight: " + flight.getName() + " was not found in the list!");
    }

    public void readFlight() {
        for (Flight f : flightList)
            System.out.println(f);
    }

    //User methods

    public void addUser(User user) {
        for (User u : userList) {
            if (user.getName().equals(u.getName())) {
                System.out.println("The user is already on the list");
                return;
            }
        }
        userList.add(user);
    }

    public void readUser() {
        for (User u : userList)
            System.out.println(u);
    }

    public void addUserToFlight(Flight flight, User user) {
        flight.addUserToFlight(user);
        addUser(user);
    }
    //what flights did a user joined

    public void readFlightForUser(User user) {
        flightList
                .stream()
                .filter(p -> p.checkUserList(user))
                .forEach(flight -> System.out.println(flight.getName() + " " + flight.getDestination() + " " + flight.getStatus()));

    }

    //How many flights did a user joined
    public void readNumberOfFlightDidUser(User user) {
        long numberOfFlight = flightList
                .stream()
                .filter(p -> p.checkUserList(user))
                .count();

        System.out.println(user.getName() + " registered to: " + numberOfFlight + " flights");
    }

    // What destinations did a user visited
    public void readDestinationVisitedByUser(User user) {
        flightList
                .stream()
                .filter(p -> p.checkUserList(user))
                .filter(p -> p.getStatus().equals(Flight.StatusEnum.FINISHED))
                .forEach(flight -> System.out.println(flight.getDestination()));
    }

    //How many destinations did a user visited

    public void readNumberOfDestination(User user) {
        long numberOfDestination = flightList
                .stream()
                .filter(p -> p.checkUserList(user))
                .filter(p -> p.getStatus().equals(Flight.StatusEnum.FINISHED))
                .count();

        System.out.println(user.getName() + " did: " + numberOfDestination + " destinations.");
    }

    public void readFlightScheduled() {
        flightList
                .stream()
                .filter(p -> p.getStatus().equals(Flight.StatusEnum.SCHEDULED))
                .forEach(flight -> System.out.println(flight));
    }

    public void readNumberOfFlightScheduled() {
        long numberOfFlight = flightList
                .stream()
                .filter(p -> p.getStatus().equals(Flight.StatusEnum.SCHEDULED))
                .count();

        System.out.println("Number of flight scheduled: " + numberOfFlight);
    }

    public void readFlightLanded() {
        flightList
                .stream()
                .filter(p -> p.getStatus().equals(Flight.StatusEnum.FINISHED))
                .forEach(flight -> System.out.println(flight));
    }

    public void readNumberOfFlightLanded() {
        long numberOfFlight = flightList
                .stream()
                .filter(p -> p.getStatus().equals(Flight.StatusEnum.FINISHED))
                .count();

        System.out.println("Number of flight already landed is : " + numberOfFlight);
    }

    public void updateFlightStatus(Date date) {
        flightList
                .stream()
                .filter(p -> p.getStatus().equals(Flight.StatusEnum.SCHEDULED))
                .filter(p -> p.getArrivalDate().before(date))
                .forEach(flight -> flight.setStatus(Flight.StatusEnum.FINISHED));
    }
}
