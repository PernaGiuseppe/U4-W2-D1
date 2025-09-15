package entities.esercizio1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        int[] numeri = new int[5];
        Random generatoreCasuale = new Random();
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = generatoreCasuale.nextInt(10) + 1;
        }
        System.out.println("L'array iniziale è: " + Arrays.toString(numeri));

        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                try {
                    System.out.println("Inserisci un numero, 0 per stoppare");
                    int numero = scanner.nextInt();
                    if (numero == 0) {
                        break;
                    }
                    System.out.println("In quale posizione vuoi inserirlo (da 0 a 4)?");
                    int posizione = scanner.nextInt();

                    numeri[posizione] = numero;
                    System.out.println("Array aggiornato" + Arrays.toString(numeri));
                } catch (InputMismatchException exe) {
                    System.err.println("Il numero da inserire deve essere un intero");
                    scanner.nextLine();

                } catch (Exception exe) {
                    System.err.println("La posizione inserita deve essere tra 0 e " + (numeri.length - 1));
                }
            }
        } finally {
            scanner.close();
            System.out.println("Programma terminato.");
        }
    }
}