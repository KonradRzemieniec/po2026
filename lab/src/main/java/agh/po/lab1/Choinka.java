package agh.po.lab1;

public class Choinka {
    private static final int STALA_WYSOKOSC = 5;

    public static void main(String[] args) {
        int rozmiar = STALA_WYSOKOSC;

        if (args.length > 0) {
            rozmiar = Integer.parseInt(args[0]);
        }

        for (int i = 1; i <= rozmiar; i++) {
            for (int y = 0; y < i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
