public class Main {
    public static void main(String[] args) {
        Aquarium monAquarium = new Aquarium();

        monAquarium.NouveauPoisson("Albert",Sexe.MALE);
        monAquarium.NouveauPoisson("Jeanne",Sexe.FEMELLE);

        monAquarium.NouvelleAlgue();

        System.out.println("Nombre d'algue : " +monAquarium.getVegetation().size());

        for (Poisson p: monAquarium.getPeuple()){
            System.out.println("Nom : "+p.getNom()+"/ Sexe : "+p.getSexe());
        }
    }
}