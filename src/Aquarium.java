import Vivant.Algue.Algue;
import Vivant.Poisson.Poisson;

import java.util.ArrayList;

public class Aquarium {


    private ArrayList<Poisson> peuple = new ArrayList<>();
    private ArrayList<Algue> vegetation = new ArrayList<>();
    private int tour = 0;

    public ArrayList<Algue> getVegetation() {
        return vegetation;
    }

    public int getTour() {
        return tour;
    }

    public ArrayList<Poisson> getPeuple() {
        return peuple;
    }

    public void NouveauPoisson(Race race,String nom, Sexe sexe){
        peuple.add(new Poisson(race.toString(),nom,sexe.toString()));
    }

    public void NouvelleAlgue(){
        vegetation.add(new Algue());
    }

    public void NouveauTour(){
        //Les poissons mangent
        tour++;
    }
}
