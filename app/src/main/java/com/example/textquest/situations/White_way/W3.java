package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class W3 implements IFabric {
    String history="Кажется, эти иероглифы вам знакомы, спустя некоторое время, странные надписи обретают смысл\n";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("К древу", new W8());
        ways.put("Пойдешь направо: сможешь отыскать то, что укроет тебя от любых невзгод", new W4());
//        ways.put("Пойдешь налево: сможешь отыскать то, что поможет уничтожить невзгоды.", new W5());

        return new SituationWithWays("Загадочный камень", history, ways);
    }
}