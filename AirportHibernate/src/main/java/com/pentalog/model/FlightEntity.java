package com.pentalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
@Table(name = "t_flight")
public class FlightEntity extends AbstractBaseEntity {
    @Column(name = "flightName")
    private String name;

    @Column(name = "destination")
    private String destination;

    @Column(name = "departureDate")
    private String departureDate;

    @Column(name = "flightDuration")
    private String flightDuration;

    @Column(name = "maxUserCapacity")
    private int maxUserCapacity;


    @ManyToMany(targetEntity = UserEntity.class)
    private List<UserEntity> userList = new ArrayList<>();

    public FlightEntity() {
        // Default constructor
    }

    public FlightEntity(String name, String destination, String departureDate, String flightDuration, int maxUserCapacity) {
        this.name = name;
        this.destination = destination;
        this.departureDate = departureDate;
        this.flightDuration = flightDuration;
        this.maxUserCapacity = maxUserCapacity;
    }

    public void addUserToFlight(UserEntity user) {
        if (userList.size() >= maxUserCapacity) {
            System.out.println("Sorry! The plane has reached it's maximum transport capacity!");
            return;
        }
        for (UserEntity u : userList) {
            if (u.getName().equals(user.getName())) {
                System.out.println("The user is already on the list!");
                return;
            }
        }

        userList.add(user);
    }

    public void deleteUserFromFlight(UserEntity user) {
        if (userList.size() == 0) {
            System.out.println("Error! \nUser list is empty!");
            return;
        }

        Iterator<UserEntity> userIterator = userList.iterator();
        while (userIterator.hasNext()) {
            UserEntity u = userIterator.next();
            if (u.getName().equals(user.getName())) {
                userIterator.remove();
                return;
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    public int getMaxUserCapacity() {
        return maxUserCapacity;
    }

    public void setMaxUserCapacity(int maxUserCapacity) {
        this.maxUserCapacity = maxUserCapacity;
    }

    public List<UserEntity> getUserList() {
        return userList;
    }

    public void setUserList(List<UserEntity> passangers) {
        this.userList = passangers;
    }

    @Override
    public String toString() {
        return "FlightEntity{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", flightDuration='" + flightDuration + '\'' +
                ", maxUserCapacity='" + maxUserCapacity;
    }
}

