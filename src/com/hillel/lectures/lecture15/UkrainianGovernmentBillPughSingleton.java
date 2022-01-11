package com.hillel.lectures.lecture15;

public class UkrainianGovernmentBillPughSingleton {

    private String president;

    private static class UkrainianGovernmentBillPughSingletonHolder {
        private static final UkrainianGovernmentBillPughSingleton INSTANCE = new UkrainianGovernmentBillPughSingleton("Zelenskiy");
    }

    public static UkrainianGovernmentBillPughSingleton getInstance() {
        return UkrainianGovernmentBillPughSingletonHolder.INSTANCE;
    }

    private UkrainianGovernmentBillPughSingleton(String president) {
        this.president = president;
    }

    public String getPresident() {
        return president;
    }

}
