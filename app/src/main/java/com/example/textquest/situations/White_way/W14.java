package com.example.textquest.situations.White_way;

import com.example.textquest.Character;
import com.example.textquest.Day;
import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;
import com.example.textquest.situations.Start;

import java.util.HashMap;

public class W14  implements IFabric {
    String history="Какое прекрасное утро, пора отправляться в путь";
    public void CurrentAttributes(){
        Character hero = Character.getCharacter();
        hero.Health=150;
        hero.Damage-=0;
        hero.Def-=0;
        Day day = Day.getDay();
        day.night=false;
        day.evening=false;
    }
    @Override
    public ISituation createSit() {

        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("К камню", new W3());
        return new SituationWithWays("Утречка", history, ways);
    }
}