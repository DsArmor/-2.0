package com.example.textquest.situations;

import com.example.textquest.Character;
import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class GenerateSituation4 implements IFabric{
    public void CurrentAttributes(){
        Character hero = Character.getCharacter();
        hero.Health-=0;
        hero.Damage-=0;
        hero.Def-=0;
    }
    String history ="Вы выбираетесь из темноты. Перед глазами открывается огромный мир, деревья, ручьи, райские звуки раздаются со всех сторон, вы облегченно выдыхаете. Кажется, этот мир рад вам\n"+
            "Вы делаете шаг вперед, но горный склон, ведущий вниз, для неокрепшего организма оказался непреодолимым препятствием, вы поскальзываетесь и падаете с огромной высоты.\n";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Далее", new GenerateSituation7());
        return new SituationWithWays("Мир", history, ways);
    }
}
