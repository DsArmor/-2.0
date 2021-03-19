package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class W7 implements IFabric {

    String history="Вы стоите на холме с которого видна поляна огра\n";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("К камню", new W2());
        ways.put("На поляну к огру", new W4());
        return new SituationWithWays("Огр", history, ways);
    }

    @Override
    public void CurrentAttributes() {

    }
}
