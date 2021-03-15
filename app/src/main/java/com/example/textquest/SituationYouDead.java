package com.example.textquest;

import java.util.HashMap;

public class SituationYouDead extends ISituation {
    public SituationYouDead(String history) {
        super("Вы умерли", history, new HashMap<>());
    }
}
