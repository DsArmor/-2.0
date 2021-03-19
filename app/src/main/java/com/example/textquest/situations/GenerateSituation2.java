package com.example.textquest.situations;

import com.example.textquest.Character;
import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationYouDead;

public class GenerateSituation2 implements IFabric {
    public void CurrentAttributes(){
        Character hero = Character.getCharacter();
        hero.Health=0;
        hero.Damage=0;
        hero.Def=0;
    }
    @Override
    public ISituation createSit() {
        return new SituationYouDead("Конец для таких лентяев всегда один - смерть");
    }
}
