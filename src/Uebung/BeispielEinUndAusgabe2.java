package Uebung;

import java.util.*;

public class BeispielEinUndAusgabe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Kullanıcının veri girmesi aktif edilir.
        System.out.println("Geben Sie bitte Ihren Namen ein");
        String name = input.nextLine();
        System.out.println("Geben Sie bitte Ihr Alter ein");
        int alter = input.nextInt();
        System.out.println("Geben Sie bitte Ihre Körpergröße ein");
        double groesse = input.nextDouble();
        System.out.println("Geben Sie bitte Ihr Gewicht ein");
        double gewicht = input.nextDouble();

        // Ausgabe:
        System.out.println("Sie heißen " + name + ", sind " + alter + " Jahre alt, sind " + groesse + " groß und sind "
                + gewicht + " Kilogram.");
        input.close(); // Kullanıcının veri girişini bitirir.
    }
}
