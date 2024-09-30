package cartes;

public class DebutLimite extends Limite {
    public DebutLimite(int km) {
        super(km);
    }
    public String toString() {
        return "Début Limite " + km + " KM";
    }
}