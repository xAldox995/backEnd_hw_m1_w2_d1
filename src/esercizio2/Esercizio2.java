package esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        System.out.println("Esercizio 2");

        Scanner in = new Scanner(System.in);

        try{
            System.out.print("Inserisci i km che hai percorso: ");
            double km = Double.parseDouble(in.nextLine());

            System.out.print("Isserisci i litri di carburante consumato: ");
            double litriCarburante = Double.parseDouble(in.nextLine());

            if (litriCarburante == 0) {
                throw new ArithmeticException("Il numero dei litri non può essere 0");
            }

            double kmPerLitro = km/litriCarburante;
            System.out.println("Hai percorso " + kmPerLitro + " km per litro");
        } catch (NumberFormatException ex) {
            System.out.println("Inserisci un numero valido!!");
        } catch (ArithmeticException ex) {
            System.out.println("Non puoi dividere per 0");
        } finally {
            in.close();
        }
    }
}
