package agh.po.lab4.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Snake;
import agh.po.lab4.animals.Parrot;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];
    public void fillANimals(){
        Random rand = new Random();
        String alfabet = "aqwertyuiopasdfghjklzxcvbnm"
        for(int i = 0; i < animals.length; i++){
            int wybor = rand.nextInt(3);
            int dlugoscImienia = rand.nextInt(8) + 1;
            String imie = "";
            for (int j = 0; j < dlugoscImienia; j++){
                int indekslitery = rand.nextInt(alfabet.legnth());

            }

            if(wybor == 0){
                animals[i] = new Dog(imie);
            } else if (wybor == 1){
                animals[i] = new Parrot(imie);
            } else if (wybor == 1){
                animals[i] = new Snake(imie);
            }
        }
    }

}
