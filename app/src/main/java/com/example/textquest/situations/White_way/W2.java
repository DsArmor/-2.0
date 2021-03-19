package com.example.textquest.situations.White_way;

import com.example.textquest.Character;
import com.example.textquest.IFabric;
import com.example.textquest.ISituation;
import com.example.textquest.SituationWithWays;

import java.util.HashMap;

public class W2 implements IFabric {
    public void CurrentAttributes(){
        Character hero = Character.getCharacter();
        hero.Health=150;
        hero.Damage-=0;
        hero.Def-=0;
    }
    String history="Наутро ты решаешь, что пора двигаться дальше. Перед вами открывается совсем не радужное будущее, Река огибает место вашего пребывания и справо и слева, нет ни единого шанса выбраться с него, а впереди темный, непролазный лес. Но между бурной реки по обе стороны от леса идут две дороги, а перед самым лесом стоит камень, на нем что-то есть";
    @Override
    public ISituation createSit() {

        HashMap<String, IFabric> ways = new HashMap<>();
        ways.put("Далее", new W3());
        return new SituationWithWays("Навстречу приключениям", history, ways);
    }
}