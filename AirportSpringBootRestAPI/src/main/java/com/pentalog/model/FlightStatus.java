package com.pentalog.model;

public enum FlightStatus {
    SCHEDULED(0),
    CANCELED(1),
    FINISHED(2);

    private final int flightStatusCode;

    private FlightStatus(int flightStatusCode) {
        this.flightStatusCode = flightStatusCode;
    }
}
