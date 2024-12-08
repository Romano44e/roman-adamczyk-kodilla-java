package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightScanner {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Cracow", false);
        airports.put("Barcelona", true);
        airports.put("Rome", false);
        airports.put("Reykjavik", true);
        airports.put("Athens", false);

        if (!airports.containsKey(flight.getDepartureAirport()) || !airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }


        if (airports.containsKey(flight.getDepartureAirport()) && airports.containsKey(flight.getArrivalAirport())) {
            Boolean departureAvailibility = airports.get(flight.getDepartureAirport());
            Boolean arrivalAvailibility = airports.get(flight.getArrivalAirport());
            if (departureAvailibility.equals(true) && arrivalAvailibility.equals(true)) {
                System.out.println("flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available.");
            } else {
                System.out.println("flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is not available.");
            }
        }
    }
}
