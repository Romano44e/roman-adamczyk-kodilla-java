package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    List<List<Country>> continentsList = new ArrayList<>();

    public World(List<List<Country>> continentsList) {
        this.continentsList = continentsList;
    }

    public BigDecimal getPeopleQuantity(List<List<Country>> continentsList) {
        return continentsList.stream()
                .flatMap(countries -> countries.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
