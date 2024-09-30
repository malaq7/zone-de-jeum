package cartes;

public abstract class Limite extends Carte {

    protected int km;

    public Limite(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }

}
