package Vivant.Poisson;

public class Thon extends Poisson implements Regime.Carnivore{
    public Thon(String nouveauNom, String nouveauSexe) {
        super(nouveauNom, nouveauSexe);
    }

    @Override
    public void eat(Poisson food) {

    }
}
