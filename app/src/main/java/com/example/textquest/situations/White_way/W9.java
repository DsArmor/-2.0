package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class W9 implements IFabric {
    String history="Вокруг уже смерклось, вы готовы к приключениям";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("К камню", new W10());

        return new SituationWithWays("Ночные подключения", history, ways);
    }
}
