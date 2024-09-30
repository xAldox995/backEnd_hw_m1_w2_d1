package esercizio3;

import esercizio3.contiClasses.ContoCorrente;
import esercizio3.contiClasses.ContoOnline;
import esercizio3.exception.BancaException;

import java.util.Scanner;

public class Banca {
    public static void main(String[] args) {
        System.out.println("Esercizio 3");
        Scanner in = new Scanner(System.in);

        ContoCorrente conto1 = new ContoCorrente(0, 20000.00, "Mario Bros");
        ContoOnline conto2 = new ContoOnline(0, 53250.00, "Luigi Bros", 1500);

        try {
            while (true) {
                System.out.print("Inserisci l'importo da prelevare dal conto corrente: ");
                double prelievo1 = Double.parseDouble(in.nextLine());
                if (prelievo1 == 0) break;
                conto1.preleva(prelievo1);
                System.out.println("Saldo del conto corrente aggiornato: " + conto1.restituisciSaldo());
                System.out.println("Movimenti effettuati: " + conto1.getNMovimenti());

                System.out.print("Inserisci l'importo da prelevare dal conto online: ");
                double prelievo2 = Double.parseDouble(in.nextLine());
                if (prelievo2 == 0) break;
                conto2.preleva(prelievo2);
                System.out.println("Saldo del conto online aggiornato: " + conto2.restituisciSaldo());

            }
        } catch (BancaException ex) {
            System.out.println("Errore: " + ex.getMessage());
        } finally {
            in.close();
        }
    }
}
