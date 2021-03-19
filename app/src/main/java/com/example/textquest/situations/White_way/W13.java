package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;
import com.example.textquest.situations.Start;

import java.util.HashMap;

public class W13 implements IFabric{
    String history="О даа, вы нашли меч кладенец, вы сможете покорить всё!";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Победа!", new Start());
        return new SituationWithWays("Да прибудет с вами сила", history, ways);
    }

    @Override
    public void CurrentAttributes() {

    }
}

