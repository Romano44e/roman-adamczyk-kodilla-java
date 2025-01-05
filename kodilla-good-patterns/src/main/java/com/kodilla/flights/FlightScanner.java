package com.kodilla.flights;

import java.util.List;
import java.util.stream.Stream;

public class FlightScanner {

    public void findDirectFlightFrom(String wantedDepartureAirport) {

        List<Flight> directFlightsBase = FlightBase.getDirectFlightsBase();
        List<Flight> list = directFlightsBase.stream()
                .filter(flight1 -> flight1.getDepartureAirport().equals(wantedDepartureAirport))
                .toList();

        System.out.println();
        System.out.println("from " + wantedDepartureAirport + " found flights to: ");
        list.stream()
                .forEach(flight -> System.out.println(flight.getArrivalAirport()));
    }

    public void findDirectFlightTo(String wantedArrivalAirport) {

        List<Flight> directFlightsBase = FlightBase.getDirectFlightsBase();
        List<Flight> list = directFlightsBase.stream()
                .filter(flight1 -> flight1.getArrivalAirport().equals(wantedArrivalAirport))
                .toList();

        System.out.println();
        System.out.println("to " + wantedArrivalAirport + " found flights from: ");
        list.stream()
                .forEach(flight -> System.out.println(flight.getDepartureAirport()));
    }

    public void findIndirectFlight(String wantedDepartureAirport ,String wantedArrivalAirport) {

        List<Flight> indirectFlightsBase = FlightBase.getIndirectFlightsBase();
        List<Flight> list = indirectFlightsBase.stream()
                .filter(flight1 -> flight1.getDepartureAirport().equals(wantedDepartureAirport) && flight1.getArrivalAirport().equals(wantedArrivalAirport))
                .toList();

        System.out.println();
        System.out.println("from " + wantedDepartureAirport + " to " + wantedArrivalAirport + " found indirect flights via: ");
        list.stream()
                .forEach(flight -> System.out.println(flight.getAirportWithTransfer()));
    }
}
