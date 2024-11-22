package com.medlink.cathbackend.tdMap;

import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {
    private Map<Employe, Departement> employes;

    public SocieteHashMap() {
        employes = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employes.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> entry : employes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : employes.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement d : employes.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = employes.get(e);
        if (d != null) {
            System.out.println(d);
        } else {
            System.out.println("Employé non trouvé.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employes.containsValue(d);
    }
}