package Vivant.Poisson;

import Vivant.Algue.Algue;

public class Herbivore extends Poisson implements Regime.Herbivore{

    public Herbivore(String nouvelleRace, String nouveauNom, String nouveauSexe) {
        super(nouvelleRace, nouveauNom, nouveauSexe);
    }

    @Override
    public void eat(Algue food) {

    }
}
