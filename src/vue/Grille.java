package vue;

import java.util.Observer;

import modele.Carte;
import modele.Coordonnees;

public abstract class Grille implements Observer {
	
	public abstract void initialiser(int taille,Carte carte);
	public abstract void rafraichir();
	public abstract void placerBateau();
	public abstract Coordonnees tirer();
	

}
