package Vivant.Poisson;

import Vivant.EtreVivant;

public class Poisson implements EtreVivant {
    private final String nom;
    private final Sexe sexe;

    public enum Sexe {
        Mâle,
        Femelle
    }

    public Poisson(String nouveauNom, Sexe nouveauSexe){
        this.nom = nouveauNom;
        this.sexe = nouveauSexe;
    }

    public String getNom() {
        return nom;
    }

    public Sexe getSexe() {
        return sexe;
    }
}


