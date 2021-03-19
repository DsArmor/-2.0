package com.example.textquest.situations;

import com.example.textquest.Character;
import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class GenerateSituation6  implements IFabric {
    public void CurrentAttributes(){
        Character hero = Character.getCharacter();
        hero.Health-=10;
        hero.Damage+=5;
        hero.Def-=1;
    }

    String history = "Вы давите на него, через несколько секунд он с неохотой поддается под вашими усилиями, где-то щелкает что-то, а затем стена отходит в сторону, а на вас налетает странный ветер, кажется что-то изменилось внутри\n вас обуревает страх из-за сгустившейся темноты и страшных звуков доносящихся из глубины прохода";
    @Override
    public ISituation createSit() {
        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("К свету, срочно", new GenerateSituation9());
        return new SituationWithWays("Больной или нет?", history, ways);
    }
}
