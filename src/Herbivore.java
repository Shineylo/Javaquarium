public abstract class Herbivore extends Poisson{

    public Herbivore(String nom, Sexe sexe) {
        super(nom, sexe);
    }

    public Algue manger(Algue algue) {
        this.setAgis(true);
        algue.setAgis(true);
        return algue;
    }
}
