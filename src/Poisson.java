public class Poisson {
    private final String nom;
    private final Sexe sexe;

    public Poisson(String nouveauNom,Sexe nouveauSexe){
        this.nom = nouveauNom;
        this.sexe = nouveauSexe;
    }

    public String getNom() {
        return nom;
    }

    public Sexe getSexe() {
        return sexe;
    }
}
