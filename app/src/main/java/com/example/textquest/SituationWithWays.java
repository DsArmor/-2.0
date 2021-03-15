package com.example.textquest;

import java.util.HashMap;
import java.util.Map;

public class SituationWithWays extends ISituation {
    public SituationWithWays(String title, String history, HashMap<String, IFabric> ways) {
        super(title, history, ways);
    }
}
