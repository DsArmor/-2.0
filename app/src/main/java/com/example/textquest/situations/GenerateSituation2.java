package com.example.textquest.situations;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationYouDead;

public class GenerateSituation2 implements IFabric {
    @Override
    public ISituation createSit() {
        return new SituationYouDead("Конец для таких лентяев всегда один - смерть");
    }
}
