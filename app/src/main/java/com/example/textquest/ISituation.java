package com.example.textquest;

import java.util.Map;

public abstract class ISituation {
    String title;
    String history;
    Map<String, IFabric> ways;

    public ISituation(String title, String history, Map<String, IFabric> ways) {
        this.title = title;
        this.history = history;
        this.ways = ways;
    }
}
