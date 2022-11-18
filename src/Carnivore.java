public abstract class Carnivore extends Poisson{
    public Carnivore(String nom, Sexe sexe) {
        super(nom, sexe);
    }

    public Poisson manger(Poisson poisson) {
        this.setAgis(true);
        poisson.setAgis(true);
        return poisson;
    }
}
