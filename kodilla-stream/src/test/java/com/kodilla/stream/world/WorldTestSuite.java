package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country(new BigDecimal("38000000"), "Poland"));
        europeCountries.add(new Country(new BigDecimal("59000000"), "Italy"));
        europeCountries.add(new Country(new BigDecimal("84000000"), "Germany"));

        List<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country(new BigDecimal("1405000000"), "China"));
        asiaCountries.add(new Country(new BigDecimal("1438000000"), "India"));
        asiaCountries.add(new Country(new BigDecimal("282000000"), "Indonesia"));

        List<Country> northAmericaCountries = new ArrayList<>();
        northAmericaCountries.add(new Country(new BigDecimal("342000000"), "USA"));
        northAmericaCountries.add(new Country(new BigDecimal("39000000"), "Canada"));
        northAmericaCountries.add(new Country(new BigDecimal("140000000"), "Mexico"));

        List<List<Country>> continentsList = new ArrayList<>();
        continentsList.add(europeCountries);
        continentsList.add(asiaCountries);
        continentsList.add(northAmericaCountries);
        //When
        World world = new World(continentsList);
        BigDecimal peopleQuantityActual = world.getPeopleQuantity(continentsList);

        //Then
        BigDecimal peopleQuantityExpected = new BigDecimal("3827000000");
        assertEquals(peopleQuantityExpected, peopleQuantityActual);
    }
}
