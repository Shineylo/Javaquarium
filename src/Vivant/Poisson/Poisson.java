package Vivant.Poisson;

import Vivant.EtreVivant;

public class Poisson implements EtreVivant {
    private final String nom;
    private final String sexe;

    public Poisson(String nouveauNom, String nouveauSexe){
        this.nom = nouveauNom;
        this.sexe = nouveauSexe;
    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }
}
