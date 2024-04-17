import Vivant.Poisson.Merou;
import Vivant.Poisson.Poisson;
import Vivant.Poisson.Sole;

public class Main {
    public static void main(String[] args) {
        Aquarium monAquarium = new Aquarium();

        monAquarium.NouveauPoisson(new Merou("Albert",Poisson.Sexe.Mâle));
        monAquarium.NouveauPoisson(new Merou("Norman",Poisson.Sexe.Mâle));
        monAquarium.NouveauPoisson(new Sole("Jeanne",Poisson.Sexe.Femelle));
        monAquarium.NouveauPoisson(new Sole("Heanne",Poisson.Sexe.Femelle));

        monAquarium.NouvelleAlgue();
        monAquarium.NouvelleAlgue();

        monAquarium.NouveauTour();

        System.out.println("Nombre d'algue : " +monAquarium.getVegetation().size());

        for (Poisson p: monAquarium.getPeuple()){
            System.out.println("Nom : "+p.getNom()+"/ Sexe : "+p.getSexe());
        }
    }
}