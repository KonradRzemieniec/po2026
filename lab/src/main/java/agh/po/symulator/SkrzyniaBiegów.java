package agh.po.symulator;

public class SkrzyniaBiegów extends Komponent{
    private int aktualnyBieg;
    private int ilośćBiegów;

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }

    public int getIlośćBiegów() {
        return ilośćBiegów;
    }
    public void zwiększBieg() {
        if (aktualnyBieg < ilośćBiegów) {
            aktualnyBieg++;
        }
    }
}
