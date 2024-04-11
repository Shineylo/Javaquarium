package Vivant.Poisson;

public class PoissonClown extends Poisson implements Regime.Carnivore{
    public PoissonClown(String nouveauNom, String nouveauSexe) {
        super(nouveauNom, nouveauSexe);
    }

    @Override
    public void eat(Poisson food) {

    }
}
