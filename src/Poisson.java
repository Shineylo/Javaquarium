public abstract class Poisson extends EtreVivant{
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

    @Override
    public void estMange() {
        this.modifVie(-4);
    }

    @Override
    public void vit(){
        this.vieillir();
        this.modifVie(-1);
    }

    @Override
    public void presentation(){
        System.out.println("nom "+this.nom +" age "+this.getAge() + " pv "+ this.getPv());
    }
}
