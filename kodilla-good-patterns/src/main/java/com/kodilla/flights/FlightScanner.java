package com.kodilla.flights;

import java.util.List;
import java.util.stream.Stream;

public class FlightScanner {

    public boolean findDirectFlightFrom(String wantedAirport) {

        List<Flight> directFlightsBase = FlightBase.getDirectFlightsBase();
        List<Flight> list = directFlightsBase.stream()
                .filter(flight1 -> flight1.getDepartureAirport().equals(wantedAirport))
                .toList();

        list.stream()
                .forEach(flight -> System.out.println("Dostępne są loty z: " + flight.getDepartureAirport() + " do " + flight.getArrivalAirport()));

        return false;
    }
}
