package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;




public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        int ile_liczb = 1;
        ArrayList<Integer> lista = new ArrayList<>();


        while(ile_liczb<6){
            int n =rand.nextInt(48);
            n += 1;
            lista.add(n);
            ile_liczb += 1;
        }
        System.out.println(lista);

    }
}
