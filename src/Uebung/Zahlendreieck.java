package Uebung;

public class Zahlendreieck {
    public static void main(String[] args) {
        for (int x = 0; x<=10; x++){
            String output = "";
            for (int i = 0; i<x; i++){
                output += i + " ";
            }
            System.out.println(output );
        }
    }
}
