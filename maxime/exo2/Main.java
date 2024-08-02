package fr.maxime.exo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un chiffre positif pour avoir sa racine carrée:");
        boolean flag = false;
        while (!flag){
            try {
                int nombre = scanner.nextInt();
                if (nombre >= 0) {
                    double racineCarree = Math.sqrt(nombre);
                    System.out.println("La racine carrée de " + nombre + " est : " + racineCarree);
                    flag = true;
                } else {
                    System.out.println("Veuillez entrer un nombre positif.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un nombre entier valide.");
                scanner.nextLine();
            }
        }
    }
}
