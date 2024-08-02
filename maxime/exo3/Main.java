package fr.maxime.exo3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i < tableau.length+1; i++) {
                System.out.println(tableau[i]);
            }
        }catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println(e);
        }

    }
}
