package com.kodilla.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightBase {

    public static List<Flight> getDirectFlightsBase() {

        List<Flight> directFlights = new ArrayList<>();
        directFlights.add(new Flight("Gdańsk", "Wrocław"));
        directFlights.add(new Flight("Wrocław", "Gdańsk"));
        directFlights.add(new Flight("Gdańsk", "Kraków"));
        directFlights.add(new Flight("Kraków", "Gdańsk"));
        directFlights.add(new Flight("Kraków", "Wrocław"));
        directFlights.add(new Flight("Wrocław", "Kraków"));

     return directFlights;
    }

    public static List<Flight> getIndirectFlightsBase() {

        List<Flight> indirectFlights = new ArrayList<>();
        indirectFlights.add(new Flight("Gdańsk", "Wrocław", "Kraków"));
        indirectFlights.add(new Flight("Wrocław", "Gdańsk", "Kraków"));
        indirectFlights.add(new Flight("Gdańsk", "Kraków", "Wrocław"));
        indirectFlights.add(new Flight("Kraków", "Gdańsk", "Wrocław"));
        indirectFlights.add(new Flight("Kraków", "Wrocław", "Gdańsk"));
        indirectFlights.add(new Flight("Wrocław", "Kraków", "Gdańsk"));

        return indirectFlights;
    }
}
