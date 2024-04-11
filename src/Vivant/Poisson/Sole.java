package Vivant.Poisson;

import Vivant.Algue.Algue;

public class Sole extends Poisson implements Regime.Herbivore{
    public Sole(String nouveauNom, String nouveauSexe) {
        super(nouveauNom, nouveauSexe);
    }

    @Override
    public void eat(Algue food) {

    }
}
