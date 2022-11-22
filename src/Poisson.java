public abstract class Poisson extends EtreVivant{
    private String nom;
    private Sexe sexe;
    private boolean agis = false;

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

    public boolean getAgis() {
        return agis;
    }

    public void setAgis(boolean agis) {
        this.agis = agis;
    }

    @Override
    public void estMange() {
        this.agis = true;
        this.modifVie(-4);
    }

    @Override
    public void vit(){
        this.modifVie(-1);
    }
}
