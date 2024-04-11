package Vivant.Poisson;

import Vivant.EtreVivant;

public class Poisson implements EtreVivant {
    private final String nom;
    private final String sexe;
    private final String race;

    public Poisson(String nouvelleRace, String nouveauNom, String nouveauSexe){
        this.race = nouvelleRace;
        this.nom = nouveauNom;
        this.sexe = nouveauSexe;
    }

    public String getRace() {
        return race;
    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }
}


