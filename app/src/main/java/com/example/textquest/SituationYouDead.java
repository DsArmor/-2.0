package com.example.textquest;

import java.util.HashMap;

public class SituationYouDead extends ISituation {
    public SituationYouDead(String history) {
        super("Мертвее мертвого", history, new HashMap<>());
    }
}
