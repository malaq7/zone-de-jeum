package cartes;

public enum Type {
	FEU("Feu Rouge", "Feu Vert", "Véhicule Prioritaire"),
    ESSENCE("Panne d'essence", "Bidon d'essence", "Citerne"),
    CREVAISON("Crevaison", "Roue de secours", "Increvable"),
    ACCIDENT("Accident", "Réparation", "As du volant");
	
	private String attaqueD ;
	private String botteD ;
	private String paradeD ;
	
	Type(String attaqueD, String botteD, String paradeD) {
		this.attaqueD = attaqueD;
		this.botteD = botteD;
		this.paradeD = paradeD;
	}

	/**
	 * @return the attqueD
	 */
	public String getAttaqueD() {
		return attaqueD;
	}

	/**
	 * @return the botteD
	 */
	public String getBotteD() {
		return botteD;
	}

	/**
	 * @return the paradeD
	 */
	public String getParadeD() {
		return paradeD;
	}
	
	
	
}
