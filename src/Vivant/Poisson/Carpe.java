package Vivant.Poisson;

import Vivant.Algue.Algue;

public class Carpe extends Poisson implements Regime.Herbivore{
    public Carpe(String nouveauNom, String nouveauSexe) {
        super(nouveauNom, nouveauSexe);
    }

    @Override
    public void eat(Algue food) {

    }
}
