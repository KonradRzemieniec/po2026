package agh.po.lab4.animals;

public class Dog extends Animal {
    public Dog(String name){
        this.name = name;
        this.iloscNog =4;
    }

    public String getDescription() {
        return "Pies, Imie " + name + " Ilosc nog: " + iloscNog;
    }

    public void makeSound(){
        System.out.println("hau hau");
    }
}
