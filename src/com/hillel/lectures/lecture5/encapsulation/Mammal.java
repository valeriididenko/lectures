package com.hillel.lectures.lecture5.encapsulation;

public abstract class Mammal extends Animal {

    protected String breast;
    protected Sex sex;

    public Mammal(int weight, String name, String breast, Sex sex) {
        super(weight, name);
        this.breast = breast;
        this.sex = sex;
    }

    @Override
    void eat() {
        System.out.println(name + " is drinking milk");
    }

    public String getBreast() {
        return breast;
    }

    public void setBreast(String breast) {
        this.breast = breast;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    void breastFeed() {
        if (sex == Sex.FEMALE) {
            System.out.println(name + " is feeding from the breast " + breast);
        } else {
            System.out.println(Sex.MALE + " can't feed anyone with the breast");
        }
    }

}
