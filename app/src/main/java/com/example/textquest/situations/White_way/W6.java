package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class W6 implements IFabric {
    String history="Вы стоите у камня и наполняетесь решимостью";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("К древу", new W8());
        ways.put("Пойдешь направо: сможешь отыскать то, что укроет тебя от любых невзгод", new W7());
//        ways.put("Пойдешь налево: сможешь отыскать то, что поможет уничтожить невзгоды.", new W8());
        return new SituationWithWays("Загадочный камень", history, ways);
    }
}
