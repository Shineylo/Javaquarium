public abstract class Herbivore extends Poisson {

    public Herbivore(String nom, Sexe sexe) {
        super(nom, sexe);
    }

    public void manger(Algue algue) {
        this.modifVie(+3);
        algue.estMange();
    }
}
