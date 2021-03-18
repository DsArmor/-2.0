package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class W8 implements IFabric {
    String history="Вы стоите у древа";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("К камню", new W6());
        ways.put("Вздремнуть до вечера", new W9());

        return new SituationWithWays("Древо", history, ways);
    }
}
