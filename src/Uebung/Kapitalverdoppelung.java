package Uebung;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Kapitalverdoppelung {
    public static void main(String[] args) {
        //Startkapital Eingabe SK
        //Zinssatz Eingabe ZS
        float SK, ZS;
        String StartKapital, Zinssatz;
        StartKapital = JOptionPane.showInputDialog("Geben Sie Startkapital ein:");
        Zinssatz = JOptionPane.showInputDialog("Geben Sie Zinssatz in Prozent ein:");

        SK = Integer.parseInt(StartKapital);
        ZS = Integer.parseInt(Zinssatz);

        int jahr = 0;
        //verzinstes Kapital => Kapital =SK
        float VK = SK;
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);

        do {
            VK = VK * (1 + ZS / 100);
            jahr = jahr + 1;
        } while (VK < 2 * SK);
        System.out.println("Kapital: " + frmt.format(VK) + "€");
        System.out.println("Kapitalverdoppelung nach " + jahr + " Jahren.");
    }

}
