package com.kodilla.exception.test;

public class FlightAppRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Rome", "Barcelona");
        FlightScanner flightScanner = new FlightScanner();

        try {
            flightScanner.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("departureAirport or arrivalAirport not found. Try again.");
        } finally {
            System.out.println("It was an attempt to find a flight.");
        }
    }
}
