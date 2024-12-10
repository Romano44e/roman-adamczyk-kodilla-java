package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class PossibleResults {


    public Map<PlayersMove, String> getResults() {
        Map<PlayersMove, String> results = new HashMap<PlayersMove, String>();
        results.put(new PlayersMove("rock", "paper"), "You loose this round!");
        results.put(new PlayersMove("scissors", "rock"), "You loose this round!");
        results.put(new PlayersMove("paper", "scissors"), "You loose this round!");
        results.put(new PlayersMove("paper", "rock"), "You win this round!");
        results.put(new PlayersMove("rock", "scissors"), "You win this round!");
        results.put(new PlayersMove("scissors", "paper"), "You win this round!");
        results.put(new PlayersMove("rock", "rock"), "It's a draw!");
        results.put(new PlayersMove("paper", "paper"), "It's a draw!");
        results.put(new PlayersMove("scissors", "scissors"), "It's a draw!");

        return results;
    }
}
