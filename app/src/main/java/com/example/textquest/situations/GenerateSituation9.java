package com.example.textquest.situations;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class GenerateSituation9  implements IFabric {
    String history="Стремглав вы бросаетесь к свету, не замечая ничего вокруг, вырвавшись наружу, вы не успеваете затормозить, ваши ноги еще не слушаются вас достаточно хорошо, а впереди оказывается узкая горная тропинка, вы кубарем летите вниз.";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Далее", new GenerateSituation8());
        return new SituationWithWays("Поехали", history, ways);
    }
}