package com.example.textquest.situations.White_way;

import com.example.textquest.Character;
import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;
import com.example.textquest.situations.GenerateSituation4;
import com.example.textquest.situations.GenerateSituation5;

import java.util.HashMap;

public class W1 implements IFabric {
    @Override
    public void CurrentAttributes(){
        Character hero = Character.getCharacter();
        hero.Health-=0;
        hero.Damage-=0;
        hero.Def-=0;
    }
    String history="Древо вдруг начинает светится тусклым светом, от него исходит тепло, вы решаете отдохнуть у дерева, вас клонит в сон, вы сворачиваетесь в клубок у его корней";
    @Override
    public ISituation createSit() {

        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Далее", new W2());
        return new SituationWithWays("Древо",history, ways);
    }
}
