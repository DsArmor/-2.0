package com.example.textquest;

public class Character {
    public int Health;
    public int Def;
    public int Damage;
    private static Character instance;

    private Character() {
        Health = 100;
        Def = 10;
        Damage = 10;
    }

    public static Character getCharacter() {
        if (instance == null) {
            instance = new Character();
        }
        return instance;
    }
}