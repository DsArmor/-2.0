package com.example.textquest;

public class GenerateSituation2 implements IFabric{
    @Override
    public ISituation createSit() {
        return new SituationYouDead("Мертвая история");
    }
}
