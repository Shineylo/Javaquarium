import java.util.ArrayList;

public class Aquarium {
    private final ArrayList<Poisson> listePoisson = new ArrayList<Poisson>();
    private final ArrayList<Algue> listeAlgues = new ArrayList<Algue>();
    private int round =0;

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
        do {
            round++;
            System.out.println("Round "+this.round);
            for (int i = 0; i < listePoisson.size(); i++) {
                Poisson cePoisson = listePoisson.get(i);
                if(cePoisson.getPv()<6){
                    if (cePoisson instanceof Herbivore) {
                        if (listeAlgues.size() > 0) {
                            int nbrRand = (int) (Math.random() * listeAlgues.size());
                            if (!listeAlgues.get(nbrRand).getAgis()) {
                                ((Herbivore) cePoisson).manger(listeAlgues.get(nbrRand));
                                System.out.println(cePoisson.getNom() + " mange algue");
                            }
                        }
                    } else if (cePoisson instanceof Carnivore) {
                        int nbrRand = (int) (Math.random() * listePoisson.size());
                        if (nbrRand != i && !listePoisson.get(nbrRand).getClass().equals(cePoisson.getClass())) {
                            ((Carnivore) cePoisson).manger(listePoisson.get(nbrRand));
                            System.out.println(cePoisson.getNom() + " mange " + listePoisson.get(nbrRand).getNom());
                        }
                    }
                }
                cePoisson.vit();
                if(cePoisson.isVivant()){
                    cePoisson.presentation();
                }else{
                    listePoisson.remove(i);
                    i--;
                }
            }
            if (listeAlgues.size() > 0) {
                for (int i = 0; i < listeAlgues.size(); i++) {
                    listeAlgues.get(i).vit();
                    if (listeAlgues.get(i).isVivant()) {
                        listeAlgues.get(i).presentation();
                    } else {
                        listeAlgues.remove(i);
                        i--;
                    }
                }
            }
            /*
            if (listeAlgues.size() > 0) {
                for (int i = 0; i < listeAlgues.size(); i++) {
                    listeAlgues.get(i).vit();
                    if (listeAlgues.get(i).isVivant()) {
                        listeAlgues.get(i).presentation();
                    } else {
                        listeAlgues.remove(i);
                        i--;
                    }
                }
            }
            if (listePoisson.size() > 0) {
                for (int i = 0; i < listePoisson.size(); i++) {
                    Poisson cePoisson = listePoisson.get(i);
                    cePoisson.vit();
                    if (cePoisson.isVivant()) {
                        if (cePoisson.getPv() <= 5) {
                            if (!cePoisson.getAgis()) {
                                if (cePoisson instanceof Herbivore) {
                                    if (listeAlgues.size() > 0) {
                                        int nbrRand = (int) (Math.random() * listeAlgues.size());
                                        if (!listeAlgues.get(nbrRand).getAgis()) {
                                            ((Herbivore) cePoisson).manger(listeAlgues.get(nbrRand));
                                            System.out.println(cePoisson.getNom() + " mange algue");
                                        }
                                    }
                                } else if (cePoisson instanceof Carnivore) {
                                    int nbrRand = (int) (Math.random() * listePoisson.size());
                                    if (!listePoisson.get(nbrRand).getAgis() && nbrRand != i && !listePoisson.get(nbrRand).getClass().equals(cePoisson.getClass())) {
                                        ((Carnivore) cePoisson).manger(listePoisson.get(nbrRand));
                                        System.out.println(cePoisson.getNom() + " mange " + listePoisson.get(nbrRand).getNom());
                                    }
                                }
                            }
                        }
                        cePoisson.presentation();
                    } else {
                        listePoisson.remove(i);
                        i--;
                    }
                }
            }
        */
        }while (round<20 /*listeAlgues.size()>0 && listePoisson.size()>0*/);
            System.out.println(" ");
    }

    public int nbrAlgue(){
        return this.listeAlgues.size();
    }

    public Poisson montrerPoisson(int index){
        return this.listePoisson.get(index);
    }
}
