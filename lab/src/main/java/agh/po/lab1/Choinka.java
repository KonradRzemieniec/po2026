package agh.po.lab1;
public class Choinka{
    public static void main(String[] args){
        int rozmiar = Integer.parseInt(args[0]);
        for(int i = 0; i < rozmiar ; i++){
            System.out.println("");
            for(int y = 0; y < i; y++){
                System.out.print("*");
            }
        }
    }
}