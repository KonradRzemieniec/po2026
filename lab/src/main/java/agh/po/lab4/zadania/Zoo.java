package agh.po.lab4.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;

import java.util.Random;

public class Zoo {

    Animal[] animals = new Animal[100];

    public void fillAnimals() {
        Random rand = new Random();
        String alfabet = "qwertyuiopasdfghjklzxcvbnm";

        for (int i = 0; i < animals.length; i++) {
            int wybor = rand.nextInt(3);
            int dlugoscImienia = rand.nextInt(8) + 1;
            String imie = "";

            for (int j = 0; j < dlugoscImienia; j++) {
                int indekslitery = rand.nextInt(alfabet.length());
                char litera = alfabet.charAt(indekslitery);
                imie = imie + litera;
            }

            if (wybor == 0) {
                animals[i] = new Dog(imie);
            } else if (wybor == 1) {
                animals[i] = new Parrot(imie);
            } else {
                animals[i] = new Snake(imie);
            }
        }
    }

    public int countLegs() {
        int suma = 0;

        for (Animal animal : animals) {
            int legs = animal.getLegs();
            suma = suma + legs;
        }

        return suma;
    }

    public void showAnimals() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println((i + 1) + ". " + animals[i].getDescription());
            animals[i].makeSound();
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fillAnimals();
        zoo.showAnimals();

        int sumaNog = zoo.countLegs();
        System.out.println("Łączna liczba nóg: " + sumaNog);
    }
}