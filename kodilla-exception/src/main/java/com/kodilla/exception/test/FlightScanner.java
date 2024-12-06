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

        for (Map.Entry<String, Boolean> airport : airports.entrySet()) {
            String key = airport.getKey();
            String departureAirport = flight.getDepartureAirport();
            String arrivalAirport = flight.getArrivalAirport();

            if (key.equals(departureAirport)) {
                System.out.println(departureAirport + " Airport availibility:");
                System.out.println(airport.getValue());
            }

            if (key.equals(arrivalAirport)) {
                System.out.println(arrivalAirport + " Airport availibility:");
                System.out.println(airport.getValue());
            }
        }
    }
}
