package com.example.textquest;

import java.util.HashMap;

public class GenerateSituation1 implements IFabric{
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Палка", new GenerateSituation2());
        ways.put("Меч", new GenerateSituation3());
        ways.put("Хуй", new GenerateSituation2());
        return new SituationWithWays("Опасность", "Супер история", ways);
    }
}
