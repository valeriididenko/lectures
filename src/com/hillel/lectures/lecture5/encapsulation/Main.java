package com.hillel.lectures.lecture5.encapsulation;

public class Main {

    public static void main(String[] args) {
        Cat persik = new Cat(10, "Persik", null, Sex.MALE, "Phoenix", 50);
        Cat mashka = new Cat(4, "Mashka", "bbbreast", Sex.FEMALE, "Phoenix", 50);

        System.out.println(persik);
        persik.play();
        System.out.println(persik);

        System.out.println();
        persik.enrage();
        System.out.println(persik);


//        System.out.println(persik);
//        System.out.println(mashka);
//
//        System.out.println("-----------------------------------");
//        persik.eat();
//        mashka.eat();
//
//        System.out.println("-----------------------------------");
//        persik.breastFeed();
//        mashka.breastFeed();
//
//        System.out.println("-----------------------------------");
//        persik.play();
//        System.out.println(persik);
//
//        System.out.println("-----------------------------------");
//        mashka.play();
//        System.out.println(mashka);
//
//        System.out.println("-----------------------------------");
//        persik.enrage();
//        System.out.println(persik);
//
//        System.out.println("-----------------------------------");
//        mashka.enrage();
//        System.out.println(mashka);
//
//        System.out.println("-----------------------------------");
//        persik.purr();
//        mashka.hiss();

    }

}
