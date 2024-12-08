package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerPlayerMove implements PlayerMove {

    @Override
    public String move() {

        Random random = new Random();
        PossibleMoves possibleMoves = new PossibleMoves();

        List<String> moves = possibleMoves.getMoves();

        int range = moves.size();
        int drawnNumber = random.nextInt(range);


        System.out.println("Computer player have selected: " + "\n"
        + moves.get(drawnNumber));

        return moves.get(drawnNumber);
    }
}
