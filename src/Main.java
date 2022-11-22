public class Main {
    public static void main(String[] args) {
        Aquarium monAquarium = new Aquarium();

        monAquarium.ajoutPoisson(new Sole("Sole",Sexe.FEMELLE));
        monAquarium.ajoutPoisson(new Merou("Merou",Sexe.MALE));
        monAquarium.ajoutPoisson(new Thon("Thon",Sexe.FEMELLE));
        monAquarium.ajoutAlgue(new Algue());
        monAquarium.ajoutAlgue(new Algue());

        monAquarium.passeTemps();
    }
}