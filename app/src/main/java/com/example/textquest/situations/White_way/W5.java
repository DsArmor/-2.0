package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;
import com.example.textquest.SituationYouDead;

import java.util.HashMap;

public class W5 implements IFabric {
    @Override
    public ISituation createSit() {
        return new SituationYouDead("Огр заметил вас почти сразу. Вы подарили ему прекрасный ужин");
    }
}
