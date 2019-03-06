package com.pentalog.model;

import com.pentalog.FlightStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
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
    private Date departureDate;

    @Column(name = "flightDuration")
    private int flightDuration;

    @Column(name = "maxUserCapacity")
    private int maxUserCapacity;

    @Enumerated
    @Column(name = "status")
    private FlightStatus status;

    @ManyToMany(targetEntity = UserEntity.class, fetch=FetchType.EAGER)
    private List<UserEntity> userList = new ArrayList<>();

    public FlightEntity() {
        // Default constructor
    }

    public FlightEntity(String name, String destination, Date departureDate, int flightDuration, int maxUserCapacity, FlightStatus status) {
        this.name = name;
        this.destination = destination;
        this.departureDate = departureDate;
        this.flightDuration = flightDuration;
        this.maxUserCapacity = maxUserCapacity;
        this.status = status;
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

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
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

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FlightEntity{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", flightDuration='" + flightDuration + '\'' +
                ", maxUserCapacity=" + maxUserCapacity +
                ", status=" + status;
    }
}

