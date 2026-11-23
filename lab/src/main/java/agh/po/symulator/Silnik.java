package agh.po.symulator;

public class Silnik extends Komponent{
    private int maxObroty = 6000;
    private int obroty = 0;

    public void uruchom() {
        obroty = 800;
    }

    public void zatrzymaj() {
        obroty = 0;
    }




}

