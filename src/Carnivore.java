public abstract class Carnivore extends Poisson{
    public Carnivore(String nom, Sexe sexe) {
        super(nom, sexe);
    }

    public void manger(Poisson poisson) {
        this.modifVie(+5);
        poisson.estMange();
    }
}
