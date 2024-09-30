package esercizio3;

import esercizio3.contiClasses.ContoCorrente;
import esercizio3.contiClasses.ContoOnline;
import esercizio3.exception.BancaException;

import java.util.Scanner;

public class Banca {
    public static void main(String[] args) {
        System.out.println("Esercizio 3");
        Scanner in = new Scanner(System.in);

        ContoCorrente conto1 = new ContoCorrente(0, 20000.00,"Mario Bros");
        ContoOnline conto2 = new ContoOnline(0,53250.00,"Luigi Bros",1500);

        try {
            while (true) {
                System.out.print("Inserisci l'importo da prelevare dal conto corrente: ");
                double prelievo = Double.parseDouble(in.nextLine());
                if (prelievo == 0) break;
                conto1.preleva(prelievo);
                System.out.println("Saldo del conto corrente aggiornato: " + conto1.restituisciSaldo());

                System.out.print("Inserisci l'importo da prelevare dal conto online: ");
                prelievo = Double.parseDouble(in.nextLine());
                if (prelievo == 0) {
                    conto2.preleva(prelievo);
                    System.out.println("Saldo del conto online aggiornato: " + conto2.restituisciSaldo() );
                }
            }
        } catch (BancaException ex) {
            System.out.println("Errore: " + ex.getMessage());
        }finally {
            in.close();
        }
    }
}
