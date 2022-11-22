public class Main {
    public static void main(String[] args) {
        Aquarium monAquarium = new Aquarium();

        monAquarium.ajoutPoisson(new Sole("Sole",Sexe.FEMELLE));
        monAquarium.ajoutPoisson(new Merou("Merou",Sexe.MALE));
        monAquarium.ajoutPoisson(new Thon("Thon",Sexe.FEMELLE));
        monAquarium.ajoutPoisson(new Thon("Ethon",Sexe.MALE));
        monAquarium.ajoutPoisson(new Carpe("Emerou",Sexe.MALE));
        monAquarium.ajoutPoisson(new Bar("MerouLista",Sexe.MALE));

        monAquarium.ajoutAlgue(new Algue());
        monAquarium.ajoutAlgue(new Algue());

        monAquarium.passeTemps();
    }
}