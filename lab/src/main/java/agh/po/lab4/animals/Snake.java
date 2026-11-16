package agh.po.lab4.animals;

public class Snake extends Animal {
    public Snake(String name){
        this.name = name;
        this.iloscNog = 0;
    }

    public String getDescription() {
        return "Wąż, Imie " + name + " Ilosc nog: " + iloscNog;
    }
}
