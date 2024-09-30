package esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println("Esercizio 1");

        Scanner in = new Scanner(System.in);
        Random randomizer = new Random();
        int [] numArray = new int[5];

        //RIEMPIAMO L'ARRAY CON VALORI CASUALI

        for (int i = 0; i < numArray.length; i++) {
            numArray[i]= randomizer.nextInt(10) + 1;
        }

        System.out.println("Array iniziale: ");
        stampaArray(numArray);

        while (true) {
            System.out.println("Inserisci un numero (premi 0 per terminare)");
            int num;
            try {
                num = Integer.parseInt(in.nextLine());
                if (num == 0) break;
                System.out.println("Inserisci l'indice dove vuoi inserire il numero: ");
                int index = Integer.parseInt(in.nextLine());
                numArray[index] = num;
                System.out.println("Stato dell' array:");
                stampaArray(numArray);
            } catch (NumberFormatException ex){
                System.out.print("Numero non valido. Riprova: ");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Posizione non valida!!");
            }
        }
        in.close();
    }

    private static void stampaArray (int [] array) {
        for (int value : array) {
            System.out.print(value+",");
        }
    }
}
