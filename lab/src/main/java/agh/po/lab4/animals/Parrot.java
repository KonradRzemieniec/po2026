package agh.po.lab4.animals;

public class Parrot extends Animal {
    public Parrot(String name){
        this.name = name;
        this.iloscNog = 2;
    }


    public String getDescription() {
        return "Papuga, Imie " + name + " Ilosc nog: " + iloscNog;
    }

}
