package com.kodilla.flights;

import java.util.Objects;

public class Flight {

    String departureAirport;
    String arrivalAirport;
    String airportWithTransfer;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Flight(String departureAirport, String arrivalAirport, String airportWithTransfer) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.airportWithTransfer = airportWithTransfer;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getAirportWithTransfer() {
        return airportWithTransfer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(arrivalAirport, flight.arrivalAirport) && Objects.equals(airportWithTransfer, flight.airportWithTransfer);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(departureAirport);
        result = 31 * result + Objects.hashCode(arrivalAirport);
        result = 31 * result + Objects.hashCode(airportWithTransfer);
        return result;
    }
}
