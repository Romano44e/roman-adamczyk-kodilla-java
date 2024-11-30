package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryname;
    private final BigDecimal population;

    public Country(final BigDecimal population, final String countryname) {
        this.population = population;
        this.countryname = countryname;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }

    public String getCountryname() {
        return countryname;
    }
}
