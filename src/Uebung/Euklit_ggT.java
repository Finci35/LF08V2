/*
Der größte gemeinsame Teiler (ggt) kann nach unterschiedlichen Verfahren berechnet werden.
Euklid hat einen Algorithmus entwickelt, der durch das abgebildete Struktogramm beschrieben ist.

AŞAĞIDAKİ PROGRAM İKİ SAYININ EN BÜYÜK ORTAK BÖLENİNİN BULUR.
 */
package Uebung;

import javax.swing.JOptionPane;

public class Euklit_ggT {
    public static void main(String[] args) {
        int m, n, r;
        String eingabe1, eingabe2;
        eingabe1 = JOptionPane.showInputDialog("Geben Sie die erste Zahl ein:");
        eingabe2 = JOptionPane.showInputDialog("Geben Sie die zweite Zahl ein:");

        m = Integer.parseInt(eingabe1);
        n = Integer.parseInt(eingabe2);
        r = m % n;

        // Hier entwickelt Ihr weiter

        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        System.out.println(n);
    }
}