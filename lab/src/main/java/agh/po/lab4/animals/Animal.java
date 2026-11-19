package agh.po.lab4.animals;

public abstract class Animal {
    int iloscNog;
    String name;

    public abstract String getDescription();

    public int getLegs() {
        return iloscNog;
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}