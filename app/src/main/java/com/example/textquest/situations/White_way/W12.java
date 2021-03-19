package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class W12 implements IFabric{
    String history="Как и ожидалось, огр спит непробудным сном, вы можете забрать сокровища, только не глупите";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Забрать сокровища", new W13());
        ways.put("Забрать сокровища я сказал!", new W13());
        return new SituationWithWays("Хмм....", history, ways);
    }

    @Override
    public void CurrentAttributes() {

    }
}
