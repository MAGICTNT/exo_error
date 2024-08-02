package fr.maxime.exo4;

import fr.maxime.exo4.entity.Etudient;
import fr.maxime.exo4.exceptions.InvalidAgeException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Etudient> etudientList = new ArrayList<>();
        boolean continuer = true;
        Scanner scanner = new Scanner(System.in);

        while (continuer) {
            System.out.println("Entrez le nom de l'étudiant (ou 'quitter' pour annuler l'action) : ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("quitter")) {
                continuer = false;
                continue;
            }

            boolean saisieValide = false;
            while (!saisieValide) {
                try {
                    System.out.println("Entrez l'âge de l'étudiant : ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    Etudient etudient = new Etudient(name, age);
                    etudientList.add(etudient);
                    saisieValide = true;
                    System.out.println("Étudiant ajouté avec succès.");

                } catch (InputMismatchException e) {
                    System.out.println("Veuillez entrer un âge valide (nombre entier).");
                    scanner.nextLine();
                } catch (InvalidAgeException e) {
                    System.out.println("L'âge doit être positif.");
                }
            }

            System.out.println("Voulez-vous entrer un autre étudiant ? (oui/non) : ");
            String reponse = scanner.nextLine().toLowerCase();
            continuer = reponse.equals("oui");
        }

        System.out.println(
                !etudientList.isEmpty() ? "\nListe des étudiants :" : "Aucune donnée n'a été saisie."
        );
        for (Etudient etudient : etudientList) {
            System.out.println("Nom : " + etudient.getNom() + ", Âge : " + etudient.getAge());
        }
    }
}
