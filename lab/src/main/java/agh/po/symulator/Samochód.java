package agh.po.symulator;

public class Samochód {
    Silnik silnik;
    SkrzyniaBiegów skrzynia;

    public void włącz() {
        silnik.uruchom();
    }
    public void wyłącz() {
        silnik.zatrzymaj();
    }
}
