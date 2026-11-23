package agh.po.symulator;

public class Pozycja {
    private double x;



    private double y;

    public void aktualizujPozycje(double deltaX, double deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }
    public String getPozycja() {
        return "(" + x + ", " + y + ")";
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
}
