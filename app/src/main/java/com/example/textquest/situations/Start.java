package com.example.textquest.situations;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class Start implements IFabric {
    String history = "На заре вселенной, когда еще только формировались планеты, существовали две могущественные силы – сейчас мы именуем их добром и злом, однако тогда о них никто не слышал.\n Готовы ли вы пройти их путь?";
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Да", new GenerateSituation1());
        ways.put("А можно сразу конец?", new GenerateSituation2());
        ways.put("Не хочу, отпутите", new GenerateSituation3());
        return new SituationWithWays("Начало", history, ways);
    }

    @Override
    public void CurrentAttributes() {
    }
}
