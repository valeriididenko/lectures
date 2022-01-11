package com.hillel.lectures.lecture15;

public class UkrainianGovernmentEagerSingleton {

    private static final UkrainianGovernmentEagerSingleton INSTANCE = new UkrainianGovernmentEagerSingleton("Zelenskiy");

    private String president;

    private UkrainianGovernmentEagerSingleton(String president) {
        this.president = president;
    }

    public static UkrainianGovernmentEagerSingleton getInstance() {
        return INSTANCE;
    }

    public String getPresident() {
        return president;
    }

}