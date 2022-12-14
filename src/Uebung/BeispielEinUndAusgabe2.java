package Uebung;

import java.util.*;

public class BeispielEinUndAusgabe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Kullanıcının veri girmesi aktif edilir.
        System.out.println("Geben Sie bitte Ihren Namen ein");
        String name = input.nextLine();
        System.out.println("Geben Sie bitte Ihr Alter ein");
        int alter = input.nextInt();
        System.out.println("Geben Sie bitte Ihre Körpergröße ein");
        double groesse = input.nextDouble();

        //Ausgabe:
        System.out.println("Sie heißen " + name + ", sind " + alter + " Jahre alt und sind " + groesse + " groß.");
        input.close(); //Kullanıcının veri girişini bitirir.
    }
}
