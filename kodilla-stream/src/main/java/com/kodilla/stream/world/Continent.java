package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    List<Country> countries = new ArrayList<>();

    public Continent(List<Country> countries) {
        this.countries = countries;
    }
}
