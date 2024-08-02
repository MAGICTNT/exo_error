package fr.maxime.exo4.entity;

import fr.maxime.exo4.exceptions.InvalidAgeException;

public class Etudient {
    String nom;
    int age;

    public Etudient(String nom, int age) throws InvalidAgeException {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }
}
