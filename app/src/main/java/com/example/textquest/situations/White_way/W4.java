package com.example.textquest.situations.White_way;

import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class W4 implements IFabric {
    boolean visit=false;
    String history2="Вы стоите на холме с которого видна поляна огра";

    String history1="Повернувшись направо, вы бодрым шагом отправляетесь навстречу неизведанному. Через некоторое время вы слышите вдали рев. Сбавив шаг, вы медленно подходите ближе и с небольшой возвышенности видите, что впереди на большом сундуке сидит некое существо (чтобы игроку было понятнее, это был огр). За огром вы видите развилку, но, кажется, мимо него просто так не проскользнуть, да и хорошо было бы заглянуть в сундук под ним\n"+
            "Подсказка: стоит жара, к вечеру всех сморит в сон такими темпами";
    @Override
    public ISituation createSit() {

        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("К камню", new W3());

        if (!visit){
            visit=true;
            ways.put("Попытаться проскользнуть вперед", new W5());
            return new SituationWithWays("Огр", history1, ways);
        } else{
            ways.put("На поляну к огру", new W5());
            return new SituationWithWays("Огр", history2, ways);
        }

    }

    @Override
    public void CurrentAttributes() {

    }
}