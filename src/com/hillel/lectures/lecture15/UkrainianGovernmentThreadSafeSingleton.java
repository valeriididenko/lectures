package com.hillel.lectures.lecture15;

public class UkrainianGovernmentThreadSafeSingleton {

    private static UkrainianGovernmentThreadSafeSingleton instance;

    private String president;

    private UkrainianGovernmentThreadSafeSingleton(String president) {
        this.president = president;
    }

    public synchronized static UkrainianGovernmentThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new UkrainianGovernmentThreadSafeSingleton("Zelenskiy");
        }
        return instance;
    }

    public String getPresident() {
        return president;
    }

}
