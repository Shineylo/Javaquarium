import java.util.ArrayList;

public class Aquarium {
    private final ArrayList<Poisson> listePoisson = new ArrayList<Poisson>();
    private final ArrayList<Algue> listeAlgues = new ArrayList<Algue>();

    public ArrayList<Poisson> getListePoisson() {
        return new ArrayList<>(listePoisson);
    }

    public ArrayList<Algue> getListeAlgues() {
        return new ArrayList<>(listeAlgues);
    }

    public void ajoutPoisson(Poisson poisson){
        listePoisson.add(poisson);
    }

    public void ajoutAlgue(Algue algue){
        listeAlgues.add(algue);
    }

    public void passeTemps(){

    }

    public int nbrAlgue(){
        return this.listeAlgues.size();
    }

    public Poisson montrerPoisson(int index){
        return this.listePoisson.get(index);
    }
}
