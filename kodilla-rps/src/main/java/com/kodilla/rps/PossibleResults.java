package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class PossibleResults {

    public Map<String, String> getResults() {

        Map<String, String> results = new HashMap<String, String>();
        results.put("rock & paper", "loose");
        results.put("scissors & rock", "loose");
        results.put("paper & scissors", "loose");
        results.put("paper & rock", "win");
        results.put("rock & scissors", "win");
        results.put("scissors & paper", "win");
        results.put("rock & rock", "tie");
        results.put("paper & paper", "tie");
        results.put("scissors & scissors", "tie");

        return results;
    }
}
