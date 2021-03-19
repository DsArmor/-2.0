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
        ways.put("К камню", new W3());
        ways.put("Вздремнуть до вечера", new W9());
        ways.put("Спать до утра", new W14());

        return new SituationWithWays("Древо", history, ways);
    }

    @Override
    public void CurrentAttributes() {

    }
}
