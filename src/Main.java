import Vivant.Poisson.Poisson;

public class Main {
    public static void main(String[] args) {
        Aquarium monAquarium = new Aquarium();

        monAquarium.NouveauPoisson(Race.Bar,"Albert",Sexe.Mâle);
        monAquarium.NouveauPoisson(Race.Mérou,"Jeanne",Sexe.Femelle);

        monAquarium.NouvelleAlgue();

        System.out.println("Nombre d'algue : " +monAquarium.getVegetation().size());

        for (Poisson p: monAquarium.getPeuple()){
            System.out.println("Nom : "+p.getNom()+"/ Sexe : "+p.getSexe());
        }
    }
}