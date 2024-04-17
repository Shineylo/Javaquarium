import Vivant.Algue.Algue;
import Vivant.EtreVivant;
import Vivant.Poisson.Carnivore;
import Vivant.Poisson.Poisson;
import Vivant.Poisson.Regime;

import java.util.ArrayList;
import java.util.Random;

public class Aquarium {


    private ArrayList<Poisson> peuple = new ArrayList<>();
    private ArrayList<Poisson> actif ;
    private ArrayList<Algue> vegetation = new ArrayList<>();
    private int tour = 0;

    Random r = new Random();

    public ArrayList<Algue> getVegetation() {
        return vegetation;
    }

    public int getTour() {
        return tour;
    }

    public ArrayList<Poisson> getPeuple() {
        return peuple;
    }

    public void NouveauPoisson(Poisson poisson){
        peuple.add(poisson);
    }

    public void NouvelleAlgue(){
        vegetation.add(new Algue());
    }

    public void NouveauTour(){

        actif = new ArrayList<>(peuple);

        while(!actif.isEmpty()){
            /*for (Poisson pi: actif) {
                System.out.println(pi.getNom());
            }
            System.out.println("================");*/
            Poisson p = actif.get(0);
            actif.remove(p);
            if(p instanceof Carnivore){
                if(!actif.isEmpty()) {
                    int x = r.nextInt(actif.size());
                    peuple.remove(actif.get(x));
                    actif.remove(x);
                }
            }else{
                int x = r.nextInt(vegetation.size());
                vegetation.remove(vegetation.get(x));

            }
        }
        tour++;
    }
}
