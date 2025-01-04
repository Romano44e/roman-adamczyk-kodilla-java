package com.kodilla.flights;

public class FlightsApplication {

    public static void main(String[] args) {

        FlightScanner flightScanner = new FlightScanner();
        flightScanner.findDirectFlightFrom("Kraków");

    }
}
