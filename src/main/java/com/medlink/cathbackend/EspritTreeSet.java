package com.medlink.cathbackend;

import java.util.Set;
import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant {
    private Set<Enseignant> enseignants = new TreeSet<>();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        return enseignants.stream().anyMatch(e -> e.getId() == id);
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        enseignants.forEach(System.out::println);
    }
}