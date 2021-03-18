package com.example.textquest.situations;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;
import com.example.textquest.situations.White_way.W1;

import java.util.HashMap;

public class GenerateSituation8  implements IFabric {
    String history="Очнувшись, ты обнаруживаешь, что чудом не наткнулся на острые камни и очень изящно прокатился по всему склону, у тебя пара ссадин, испорченное настроение и побаливающая голова(кажется, ты легко отделался)\n"+
            "Перед тобой растет огромное древо";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Встать", new W1());
        return new SituationWithWays("Поехали", history, ways);
    }
}
