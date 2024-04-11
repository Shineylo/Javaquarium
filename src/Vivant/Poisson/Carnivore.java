package Vivant.Poisson;

public class Carnivore extends Poisson implements Regime.Carnivore{


    public Carnivore(String nouvelleRace, String nouveauNom, String nouveauSexe) {
        super(nouvelleRace, nouveauNom, nouveauSexe);
    }

    @Override
    public void eat(Poisson food) {

    }
}
