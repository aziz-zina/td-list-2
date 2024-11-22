package com.medlink.cathbackend.tdMap;

public class Main {
    public static void main(String[] args) {
        // creation des employes
        Employe employe1 = new Employe(1, 1001, "Aziz", "Zina");
        Employe employe2 = new Employe(2, 1002, "Oussema", "Sahbeni");
        Employe employe3 = new Employe(3, 1003, "Selim", "Selmi");
        Employe employe4 = new Employe(4, 1004, "Bayrem", "Jlassi");

        // creation des departments
        Departement departement1 = new Departement(1, "IT");
        Departement departement2 = new Departement(2, "HR");

        // Test SocieteHashMap
        System.out.println("Test SocieteHashMap");
        SocieteHashMap societeHashMap = new SocieteHashMap();
        societeHashMap.ajouterEmployeDepartement(employe1, departement1);
        societeHashMap.ajouterEmployeDepartement(employe2, departement1);
        societeHashMap.ajouterEmployeDepartement(employe3, departement2);
        societeHashMap.ajouterEmployeDepartement(employe4, departement2);

        societeHashMap.afficherLesEmployesLeursDepartements();
        societeHashMap.afficherLesEmployes();
        societeHashMap.afficherLesDepartements();
        societeHashMap.afficherDepartement(employe1);
        System.out.println("Rechercher Employe1: " + societeHashMap.rechercherEmploye(employe1));
        System.out.println("Rechercher Departement1: " + societeHashMap.rechercherDepartement(departement1));
        societeHashMap.supprimerEmploye(employe2);
        societeHashMap.afficherLesEmployesLeursDepartements();

        // Test SocieteTreeMap
        System.out.println("Test SocieteTreeMap");
        SocieteTreeMap societeTreeMap = new SocieteTreeMap();
        societeTreeMap.ajouterEmployeDepartement(employe1, departement1);
        societeTreeMap.ajouterEmployeDepartement(employe2, departement1);
        societeTreeMap.ajouterEmployeDepartement(employe3, departement2);
        societeTreeMap.ajouterEmployeDepartement(employe4, departement2);

        societeTreeMap.afficherLesEmployesLeursDepartements();
        societeTreeMap.afficherLesEmployes();
        societeTreeMap.afficherLesDepartements();
        societeTreeMap.afficherDepartement(employe1);
        System.out.println("Rechercher Employe1: " + societeTreeMap.rechercherEmploye(employe1));
        System.out.println("Rechercher Departement1: " + societeTreeMap.rechercherDepartement(departement1));
        societeTreeMap.supprimerEmploye(employe2);
        societeTreeMap.afficherLesEmployesLeursDepartements();
    }
}