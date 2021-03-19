package com.example.textquest.situations;

import com.example.textquest.Character;
import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;
import com.example.textquest.situations.White_way.W1;

import java.util.HashMap;

public class GenerateSituation7 implements IFabric {
    public void CurrentAttributes(){
        Character hero = Character.getCharacter();
        hero.Health-=30;
        hero.Damage-=0;
        hero.Def-=0;
    }

    String history ="Очнувшись, ты обнаруживаешь, что оказался меж ветвей огромного древа, которое ласково спасло тебя от гибели своей кроной\n(кажется, все-таки мир не хочет терять пока еще неопытного исследователя)";
    @Override
    public ISituation createSit() {

        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Слезть с дерева", new W1());
        return new SituationWithWays("Падение и восход", history, ways);
    }
}

