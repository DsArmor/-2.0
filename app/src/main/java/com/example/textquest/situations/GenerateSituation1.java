package com.example.textquest.situations;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class GenerateSituation1 implements IFabric {
    String history = "Вы просыпаетесь на какой-то планете внутри тьмы(на самом деле вы просто в пещере), вокруг вас тишина, когда шум в голове утихает, вы осматриваетесь и видите, что вдалеке виднеется свет, вы не понимаете, что это, но это хоть какие-то изменения в окружении, поэтому, осознав свою сущность, вы понимаете, что можете двигаться к этому свету.";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Двигаться к свету", new GenerateSituation4());
        ways.put("Остаться в пещере и осмотреться", new GenerateSituation5());
        return new SituationWithWays("Поехали", history, ways);
    }
}
