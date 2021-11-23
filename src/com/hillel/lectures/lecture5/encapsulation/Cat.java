package com.hillel.lectures.lecture5.encapsulation;

public class Cat extends Mammal {

    private String breed;
    private int satisfaction;

    public Cat(int weight, String name, String breast, Sex sex, String breed, int satisfaction) {
        super(weight, name, breast, sex);
        this.breed = breed;
        this.satisfaction = satisfaction;
    }

    public void play() {
        System.out.println("I'm playing with " + name);
        purr();
        satisfactionChange(true);
    }

    public void enrage() {
        System.out.println("I'm annoying " + name);
        hiss();
        satisfactionChange(false);
    }

    private void satisfactionChange(boolean isIncrease) {
        int newSatisfaction = Utils.RANDOM.nextInt(11);
        if (isIncrease) {
            if (satisfaction + newSatisfaction > 100) {
                satisfaction = 100;
            } else {
                satisfaction += newSatisfaction;
            }
        } else {
            if (satisfaction - newSatisfaction < 0) {
                satisfaction = 0;
            } else {
                satisfaction -= newSatisfaction;
            }
        }
    }

    private void purr() {
        System.out.println(name + " is purring");
    }

    private void hiss() {
        System.out.println(name + " is hissing");
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weightInKg +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", satisfaction=" + satisfaction +
                ", breast='" + breast + '\'' +
                ", sex=" + sex +
                '}';
    }

}