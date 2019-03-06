package com.pentalog.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_flight")
public class Flight extends BaseEntity {

    private String name;
    private String destination;
    @Basic
    @Temporal(TemporalType.DATE)
    private Date departureDate;
    private int flightDuration;
    private int maxUserCapacity;
    @Enumerated
    private FlightStatus status;

    @ManyToMany(targetEntity = User.class)
    private Set<User> passengers = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getPassengers() {
        return passengers;
    }

    public void setPassengers(Set<User> passengers) {
        this.passengers = passengers;
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

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }
}