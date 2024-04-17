package Vivant.Poisson;

import Vivant.Algue.Algue;

public class Herbivore extends Poisson implements Regime.Herbivore{
    public Herbivore(String nouveauNom, Sexe nouveauSexe) {
        super(nouveauNom, nouveauSexe);
    }

    @Override
    public void eat(Algue food) {

    }
}
