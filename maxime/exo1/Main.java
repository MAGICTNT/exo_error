package fr.maxime.exo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.println("entré un cliffre sans virgule:");

        while (!flag) {
            try {
                int nombre = scanner.nextInt();
                flag = true;
                System.out.println("Vous avez entré : " + nombre);
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un nombre entier valide.");
                scanner.nextLine();
            }
        }
    }
}
