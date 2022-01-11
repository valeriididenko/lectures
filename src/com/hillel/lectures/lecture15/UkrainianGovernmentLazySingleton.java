package com.hillel.lectures.lecture15;

public class UkrainianGovernmentLazySingleton {

    private static UkrainianGovernmentLazySingleton instance;

    private String president;

    private UkrainianGovernmentLazySingleton(String president) {
        this.president = president;
    }

    public static UkrainianGovernmentLazySingleton getInstance() {
        if (instance == null) {
            instance = new UkrainianGovernmentLazySingleton("Zelenskiy");
        }
        return instance;
    }

    public String getPresident() {
        return president;
    }

}
