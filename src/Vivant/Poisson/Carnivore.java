package Vivant.Poisson;

public class Carnivore extends Poisson implements Regime.Carnivore{
    public Carnivore(String nouveauNom, Sexe nouveauSexe) {
        super(nouveauNom, nouveauSexe);
    }

    @Override
    public void eat(Poisson food) {

    }
}
