package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class W10 implements IFabric {
    String history="Вы стоите у камня\n";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("К древу", new W11());
        ways.put("Пойдешь направо: сможешь отыскать то, что укроет тебя от любых невзгод", new W12());
        return new SituationWithWays("Загадочный камень", history, ways);
    }
}