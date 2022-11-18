public class Main {
    public static void main(String[] args) {
        Aquarium monAquarium = new Aquarium();

        for (int i = 0;i<5;i++){
            monAquarium.ajoutPoisson(new Poisson());
        }

        monAquarium.ajoutPoisson(new Poisson("Bryan",Sexe.MALE));

        System.out.println(monAquarium.getListeAlgues().size());

        for (int i = 0;i<monAquarium.getListePoisson().size();i++){
            System.out.println(monAquarium.getListePoisson().get(i).getNom() + " " +monAquarium.getListePoisson().get(i).getSexe());
        }
    }
}