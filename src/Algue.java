public class Algue extends EtreVivant{
    private boolean agis = false;

    public boolean getAgis() {
        return agis;
    }

    public void setAgis(boolean agis) {
        this.agis = agis;
    }

    @Override
    public void estMange() {
        this.agis = true;
        this.modifVie(-2);
    }

    @Override
    public void vit(){
        this.modifVie(1);
    }
}
