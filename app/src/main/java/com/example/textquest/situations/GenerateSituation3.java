package com.example.textquest.situations;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationYouDead;

public class GenerateSituation3 implements IFabric {
    @Override
    public ISituation createSit() {
        return new SituationYouDead("Вы мертвы душевно!!!\n Проваливайте отсюда");
    }
}
