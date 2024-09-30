package cartes;
import java.util.ArrayList;
import java.util.List;


public class JeuDeCartes {

	private List<Configuration> typesDeCartes;
    public JeuDeCartes() {
        this.typesDeCartes = new ArrayList<>();
    }

    public void ajouterConfiguration(Configuration configuration) {
        typesDeCartes.add(configuration);
    }


    public String affichageJeuDeCartes() {
        StringBuilder affichage = new StringBuilder("JEU :\n");
        for (Configuration config : typesDeCartes) {
            affichage.append(config.getNbExemplaires())
                     .append(" ")
                     .append(config.getCarte().toString())
                     .append("\n");
        }
        return affichage.toString();
    }
}
