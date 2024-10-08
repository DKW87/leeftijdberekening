package controller;

import java.util.Scanner;

/* Dit is een leeftijdberekenaar op basis van geboortejaar. Daarnaast vraag het naar de naam van de gebruiker en het huidige jaar. Met vriendelijke groet, Danny Kwant */
public class LeeftijdBerekeningLauncher {

    public static void main(String[] args) {

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Vraag naar huidige jaar
        System.out.println("Welk jaar is het?");

        // Save jaar input naar variabele
        int huidigjaar = scanner.nextInt();
        scanner.nextLine();

        // Vraag naam gebruiker
        System.out.println("Wat is jouw naam?");

        // Save naam input naar variabele
        String naam = scanner.nextLine();


        // Vraag geboortejaar gebruiker
        System.out.println("Wat is je geboortejaar?");

        // Save geboortejaar input naar variabele
        int geboortejaar = scanner.nextInt();

        // Print de naam + leeftijd van de gebruiker dmv huidig jaar - geboortejaar
        System.out.println("Beste " + naam + ". Eind " + huidigjaar + " zal je leeftijd " + (huidigjaar - geboortejaar) + " zijn.");

    }
}
