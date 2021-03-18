package com.example.textquest.situations;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class GenerateSituation5 implements IFabric {
    String history = "Вы обшариваете все стены в поисках чего-то, что должно было бы сказать вам о том, откуда вы, почему появились в этой пещере и подсказки для следующих действий, но тщетно, тишина начинает на вас давить, плюнув на все, вы двигаетесь к свету\n" +
            "Но не пройдя и пары шагов, вы вдруг замечаете выступ в стене, на котором переливается свет не так, как на всем окружающем. С любопытством вы подходите к нему\n";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Вдавить этот странный камень в стену", new GenerateSituation6());
        ways.put("Бросить это глупое занятие", new GenerateSituation9());
        return new SituationWithWays("Искатель приключений на задницу", history, ways);
    }
}
