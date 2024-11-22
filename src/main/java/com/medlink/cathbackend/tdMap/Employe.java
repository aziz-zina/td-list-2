package com.medlink.cathbackend.tdMap;

public class Employe implements Comparable<Employe> {
    private int cin;
    private int matricule;
    private String nom;
    private String prenom;

    // Constructeur sans paramètre
    public Employe() {}

    // Constructeur avec paramètres
    public Employe(int cin, int matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et Setters
    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return cin == employe.cin;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Employe{" +
                "cin=" + cin +
                ", matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    // Implémentation de la méthode compareTo
    @Override
    public int compareTo(Employe other) {
        return Integer.compare(this.cin, other.cin);
    }
}