package com.hillel.lectures.lecture15;

public class Main {

    public static void main(String[] args) {
        UkrainianGovernmentEagerSingleton ukrainianGovernment = UkrainianGovernmentEagerSingleton.getInstance();
        UkrainianGovernmentEagerSingleton anotherUkrainianGovernment = UkrainianGovernmentEagerSingleton.getInstance();
        System.out.println(ukrainianGovernment);
        System.out.println(anotherUkrainianGovernment);
        System.out.println();

        System.out.println(UkrainianGovernmentStaticSingleton.instance);
        System.out.println(UkrainianGovernmentStaticSingleton.instance.getPresident());

        System.out.println(UkrainianGovernmentLazySingleton.getInstance().getPresident());

    }

}