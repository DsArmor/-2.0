package com.example.textquest;

public class Day {
    public boolean evening=false;
    public boolean night=false;
    private static Day instance = null;

    private Day() {
    }

    public static Day getDay() {
        if (instance == null) {
            instance = new Day();
        }
        return instance;
    }
}