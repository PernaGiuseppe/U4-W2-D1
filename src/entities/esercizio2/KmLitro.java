package entities.esercizio2;

import exceptions.NumberLessThanZeroException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KmLitro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci i chilometri percorsi: ");
            double km = scanner.nextDouble();

            if (km < 0) {
                throw new NumberLessThanZeroException("I chilometri percorsi non possono essere un valore negativo.");
            }

            System.out.print("Inserisci i litri di carburante consumati: ");
            double litri = scanner.nextDouble();

            if (litri < 0) {
                throw new NumberLessThanZeroException("I litri di carburante non possono essere un valore negativo.");
            }

            if (litri == 0) {
                System.err.println("Errore: I litri consumati non possono essere zero.");
            } else {
                double kmPerLitro = km / litri;
                System.out.println("Il consumo è di " + kmPerLitro + " km/litro.");
            }
        } catch (InputMismatchException exe) {
            System.err.println("Errore: Inserisci solo valori numerici.");
        } catch (NumberLessThanZeroException exe) {
            System.err.println("Errore: " + exe.getMessage());
        } finally {
            scanner.close();
            System.out.println("Programma terminato.");
        }
    }
}