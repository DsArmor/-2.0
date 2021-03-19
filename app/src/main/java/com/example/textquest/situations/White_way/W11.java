package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class W11 implements IFabric {
    String history="Вы стоите у древа";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("К камню", new W1());
        ways.put("Спать до утра", new W2());

        return new SituationWithWays("Поехали", history, ways);
    }

    @Override
    public void CurrentAttributes() {

    }
}
