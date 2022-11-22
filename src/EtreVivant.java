public abstract class EtreVivant {
    private int pv = 10;
    private int age = 0;
    private boolean vivant = true;

    public int getPv() {
        return pv;
    }

    public void modifVie(int modif){
        this.pv = this.pv + modif;
        if(this.pv<=0){
            this.vivant = false;
        }
    }

    public abstract void estMange();

    public abstract void vit();

    public int getAge() {
        return age;
    }

    public void vieillir() {
        this.age ++;
        if(this.age>=20){
            this.vivant = false;
        }
    }

    public boolean isVivant() {
        return vivant;
    }

    public abstract void presentation();
}
