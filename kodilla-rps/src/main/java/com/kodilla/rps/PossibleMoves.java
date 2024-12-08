package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class PossibleMoves {

    public List<String> getMoves() {
        List<String> moves = new ArrayList<String>();
        moves.add("rock");
        moves.add("paper");
        moves.add("scissors");

        return moves;
    }
}
