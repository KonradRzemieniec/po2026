package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> mojeTypy = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            mojeTypy.add(Integer.parseInt(args[i]));
        }

        Random rand = new Random();
        long liczbaLosowan = 0;
        int trafienia = 0;

        long czasStart = System.currentTimeMillis();

        while (trafienia < 6) {
            liczbaLosowan++;

            ArrayList<Integer> wylosowane = new ArrayList<>();
            while (wylosowane.size() < 6) {
                int n = rand.nextInt(49) + 1;
                if (!wylosowane.contains(n)) {
                    wylosowane.add(n);
                }
            }

            trafienia = 0;
            /*for (int liczba : mojeTypy) {
                if (wylosowane.contains(liczba)) {
                    trafienia++;
                }
            }

             */
            wylosowane.retainAll(mojeTypy);
            trafienia = wylosowane.size();

        }

        long czasKoniec = System.currentTimeMillis();
        long czasTrwania = czasKoniec - czasStart;

        System.out.println("Trafiono 6/6!");
        System.out.println("Liczba losowań: " + liczbaLosowan);
        System.out.println("Łączny czas: " + czasTrwania + " ms (" + (czasTrwania / 1000.0) + " s)");
        long parametr = liczbaLosowan / czasTrwania;
        System.out.println("Parametr " + parametr + " losowania/s");
    }
}