package jeu;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import cartes.Carte;

public class Sabot {
	int nbCartes;
	private Carte[] cartes;
	private int nombreOperations = 0;
	public Sabot(Carte[] cartes) {
        this.cartes = cartes;
        this.nbCartes = cartes.length;  
    }

    public boolean estVide() {
        return nbCartes == 0;
    }
    
    public void ajouterCarte(Carte carte) {
        if (nbCartes >= cartes.length) {
            throw new IllegalStateException("Le sabot est plein.");
        }
        cartes[nbCartes] = carte;
        nbCartes++;
        nombreOperations++;  
    }
    public Iterator<Carte> iterator() {
        return new Iterateur();
    }

    public Carte piocher() {
        Iterator<Carte> it = iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Le sabot est vide.");
        }
        Carte carte = it.next();
        it.remove();
        return carte;
    }

    private class Iterateur implements Iterator<Carte> {
        private int index = 0;
        private boolean nextCalled = false;
        private int nombreOperationsReference = nombreOperations;

        private void verificationConcurrence() {
            if (nombreOperations != nombreOperationsReference) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public boolean hasNext() {
            return index < nbCartes;
        }

        @Override
        public Carte next() {
            verificationConcurrence();
            while (index < cartes.length&& cartes[index]==null) {
                index++;  
            }
            if (index >= nbCartes|| cartes[index] == null) {
                throw new NoSuchElementException("Plus de cartes disponibles.");
            }
            nextCalled = true;
            return cartes[index++];
        }

        @Override
        public void remove() {
            verificationConcurrence();
            if (!nextCalled) {
                throw new IllegalStateException("Impossible de supprimer sans avoir appelé next.");
            }

            for (int i = index - 1; i < nbCartes - 1; i++) {
                cartes[i] = cartes[i + 1];
            }
            cartes[--nbCartes] = null;  
            nextCalled = false;
            nombreOperations++;
            nombreOperationsReference++;
            index--;  
        }
    }
}