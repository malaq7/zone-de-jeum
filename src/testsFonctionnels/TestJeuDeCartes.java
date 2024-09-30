package testsFonctionnels;
import cartes.Carte;
import cartes.Borne;
import cartes.Attaque;
import cartes.Parade;
import cartes.Type;
import cartes.Configuration;
import cartes.JeuDeCartes;


public class TestJeuDeCartes {

    public static void main(String[] args) {
  
        Carte carte25KM = new Borne(25);  
        Carte carte50KM = new Borne(50);
        Carte feuVert = new Parade(Type.FEU); 
        Carte feuRouge = new Attaque(Type.FEU);  


        Configuration config25KM = new Configuration(carte25KM, 10);
        Configuration config50KM = new Configuration(carte50KM, 10);
        Configuration configFeuVert = new Configuration(feuVert, 14);
        Configuration configFeuRouge = new Configuration(feuRouge, 5); 

        JeuDeCartes jeuDeCartes = new JeuDeCartes();
        jeuDeCartes.ajouterConfiguration(config25KM);
        jeuDeCartes.ajouterConfiguration(config50KM);
        jeuDeCartes.ajouterConfiguration(configFeuVert);
        jeuDeCartes.ajouterConfiguration(configFeuRouge);


        System.out.println(jeuDeCartes.affichageJeuDeCartes());
    }
}