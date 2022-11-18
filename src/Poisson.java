public class Poisson {
    private String nom;
    private Sexe sexe;

    public Poisson(String nom, Sexe sexe) {
        this.nom = nom;
        this.sexe = sexe;
    }

    public Poisson() {
        this.nom = "Poisson";
        this.sexe = Sexe.MALE;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Sexe getSexe() {
        return sexe;
    }
}
