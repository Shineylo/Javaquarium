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
        if(listePoisson.size()>0){
            for (int i = 0;i<listePoisson.size();i++) {
                Poisson cePoisson = listePoisson.get(i);
                if(cePoisson.getPv()<=10) {
                    if (!cePoisson.getAgis()) {
                        if (cePoisson instanceof Herbivore) {
                            if (listeAlgues.size() > 0) {
                                while (!cePoisson.getAgis()) {
                                    int nbrRand = (int) (Math.random() * listeAlgues.size());
                                    if (!listeAlgues.get(nbrRand).getAgis()) {
                                        ((Herbivore) cePoisson).manger(listeAlgues.get(nbrRand));
                                        System.out.println(cePoisson.getNom() + " mange algue");
                                    }
                                }
                            } else {
                                throw new videException("algue");
                            }
                        } else if (cePoisson instanceof Carnivore) {
                            while (!cePoisson.getAgis()) {
                                int nbrRand = (int) (Math.random() * listePoisson.size());
                                if (!listePoisson.get(nbrRand).getAgis() && nbrRand !=i &&!listePoisson.getClass().equals(cePoisson.getClass())) {
                                    ((Carnivore) cePoisson).manger(listePoisson.get(nbrRand));
                                    System.out.println(cePoisson.getNom() + " mange " + listePoisson.get(nbrRand).getNom());
                                }
                            }
                        }
                    }
                }
            }
        }else{
            throw new videException("Poisson");
        }
    }

    public int nbrAlgue(){
        return this.listeAlgues.size();
    }

    public Poisson montrerPoisson(int index){
        return this.listePoisson.get(index);
    }
}
