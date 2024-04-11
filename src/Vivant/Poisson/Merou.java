package Vivant.Poisson;

public class Merou extends Poisson implements Regime.Carnivore{
    public Merou(String nouveauNom, String nouveauSexe) {
        super(nouveauNom, nouveauSexe);
    }

    @Override
    public void eat(Poisson food) {

    }
}
