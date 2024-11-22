package com.medlink.cathbackend.tdSet;

public class Main {
    public static void main(String[] args) {
        // Create Enseignant instances
        Enseignant enseignant1 = new Enseignant(1, "Dupont", "Jean");
        Enseignant enseignant2 = new Enseignant(2, "Durand", "Marie");
        Enseignant enseignant3 = new Enseignant(3, "Martin", "Paul");

        // Test toString() method
        System.out.println(enseignant1);
        System.out.println(enseignant2);

        // Test equals() method
        System.out.println("Enseignant1 equals Enseignant2: " + enseignant1.equals(enseignant2));
        Enseignant enseignant4 = new Enseignant(1, "Dupont", "Jean");
        System.out.println("Enseignant1 equals Enseignant4: " + enseignant1.equals(enseignant4));

        // Test getters and setters
        enseignant1.setNom("Martin");
        System.out.println("Updated Nom of Enseignant1: " + enseignant1.getNom());

        // Test EspritHashSet
        System.out.println("HashSet");
        EspritHashSet espritHashSet = new EspritHashSet();
        espritHashSet.ajouterEnseignant(enseignant1);
        espritHashSet.ajouterEnseignant(enseignant2);
        espritHashSet.ajouterEnseignant(enseignant3);
        espritHashSet.displayEnseignants();
        System.out.println("Rechercher Enseignant1: " + espritHashSet.rechercherEnseignant(enseignant1));
        System.out.println("Rechercher Enseignant with ID 2: " + espritHashSet.rechercherEnseignant(2));
        espritHashSet.supprimerEnseignant(enseignant2);
        espritHashSet.displayEnseignants();

        // Test EspritTreeSet
        System.out.println("TreeSet");
        EspritTreeSet espritTreeSet = new EspritTreeSet();
        espritTreeSet.ajouterEnseignant(enseignant1);
        espritTreeSet.ajouterEnseignant(enseignant2);
        espritTreeSet.ajouterEnseignant(enseignant3);
        espritTreeSet.displayEnseignants();
        System.out.println("Rechercher Enseignant1: " + espritTreeSet.rechercherEnseignant(enseignant1));
        System.out.println("Rechercher Enseignant with ID 2: " + espritTreeSet.rechercherEnseignant(2));
        espritTreeSet.supprimerEnseignant(enseignant2);
        espritTreeSet.displayEnseignants();
    }
}