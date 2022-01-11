package com.hillel.lectures.lecture15;

public class UkrainianGovernmentStaticSingleton {

    public static UkrainianGovernmentStaticSingleton instance;
    private String president;

    static {
        instance = new UkrainianGovernmentStaticSingleton("Zelenskiy");
    }

    private UkrainianGovernmentStaticSingleton(String president) {
        this.president = president;
    }

    public String getPresident() {
        return president;
    }

}
