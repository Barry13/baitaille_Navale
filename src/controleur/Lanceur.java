package controleur;

import vue.Grille;
import vue.GrilleGraphique;
import divers.Constantes;
import modele.*;

public class Lanceur {
	
	public static void main (String[] args){
		
		Joueur joueur1 	= new Joueur("Joueur1");
		Joueur joueur2 	= new Joueur("Joueur2");
		
		Carte carte  	= new Carte();
		
		Grille grille1 	= new GrilleGraphique("Joueur1");
		Grille grille2 	= new GrilleGraphique("Joueur2"); 
		
		carte.addObserver(grille1);
		carte.addObserver(grille2);
		
		for(int i=1; i<Constantes.nombreBateaux; i++){
		}
		
	}

}
