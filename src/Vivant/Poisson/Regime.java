package Vivant.Poisson;

import Vivant.Algue.Algue;
import Vivant.EtreVivant;

public interface Regime<t extends EtreVivant>{

    void eat(t food);

    interface Carnivore extends Regime<Poisson>{ }

    interface Herbivore extends Regime<Algue>{ }

}
