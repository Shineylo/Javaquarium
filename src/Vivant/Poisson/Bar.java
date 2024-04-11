package Vivant.Poisson;

import Vivant.Algue.Algue;

public class Bar extends Poisson implements Regime.Herbivore{
    public Bar(String nouveauNom, String nouveauSexe) {
        super(nouveauNom, nouveauSexe);
    }

    @Override
    public void eat(Algue food) {

    }
}
