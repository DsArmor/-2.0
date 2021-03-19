package com.example.textquest.situations.White_way;

import com.example.textquest.Character;
import com.example.textquest.Day;
import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;
import com.example.textquest.SituationYouDead;

import java.util.HashMap;

public class W5 implements IFabric {
    public void CurrentAttributes(){
        Character hero = Character.getCharacter();
        hero.Health=0;
        hero.Damage=0;
        hero.Def=0;
        Day day = Day.getDay();
    }
    @Override
    public ISituation createSit() {
        return new SituationYouDead("Огр заметил вас почти сразу. Вы подарили ему прекрасный ужин");
    }
}
