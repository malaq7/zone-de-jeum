package cartes;

public class Attaque extends Bataille {

	public Attaque(Type type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
    @Override
    public String toString() {
        return type.getAttaqueD();  // Utilise la valeur d'attaque depuis l'énumération
    }

}
