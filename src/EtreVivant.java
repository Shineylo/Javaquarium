public abstract class EtreVivant {
    private int pv = 10;

    public int getPv() {
        return pv;
    }

    public void modifVie(int modif){
        this.pv = this.pv + modif;
    }

    public abstract void estMange();

    public abstract void vit();
}
