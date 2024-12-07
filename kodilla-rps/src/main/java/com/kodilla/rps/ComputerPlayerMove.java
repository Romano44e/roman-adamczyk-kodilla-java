package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerPlayerMove implements PlayerMove {

    @Override
    public String move() {

        Random random = new Random();

        List<String> elements = new ArrayList<>();
        elements.add("rock");
        elements.add("paper");
        elements.add("scissors");

        int range = elements.size();
        int drawnNumber = random.nextInt(range);

        System.out.println("Computer player have selected: ");
        System.out.println(elements.get(drawnNumber));

        return elements.get(drawnNumber);
    }
}
