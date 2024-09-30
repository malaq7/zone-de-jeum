package testsFonctionnels;

import jeu.Sabot;
import cartes.Carte;
import cartes.Borne;

import java.util.Iterator;

import cartes.Attaque;
import cartes.Parade;
import cartes.Type;

public class TestSabot {

    public static void main(String[] args) {
    	Carte[] cartes = new Carte[10];
        Carte carte25KM = new Borne(25);
        Carte carte50KM = new Borne(50);
        Carte feuRouge = new Attaque(Type.FEU);
        Carte feuVert = new Parade(Type.FEU);
        Carte feuVerta = new Parade(Type.FEU);

        cartes[0] = carte25KM;
        cartes[1] = carte50KM;
        cartes[2] = feuRouge;
        cartes[3] = feuVert;
        cartes[4] = feuVerta;
        Sabot sabot = new Sabot(cartes);
        while (!sabot.estVide()) {
            Carte carte = sabot.piocher();
            System.out.println("Je pioche " + carte.toString());
        }

        Carte[] nouvellesCartes = {carte25KM, carte50KM}; 
        sabot = new Sabot(nouvellesCartes);  

        sabot.ajouterCarte(carte25KM);
        sabot.ajouterCarte(carte50KM);

        Iterator<Carte> it = sabot.iterator();
        while (it.hasNext()) {
            Carte carte = it.next();
            System.out.println("Je pioche " + carte.toString());
            it.remove(); 
        }

    } 
    }
