package modele;

import java.util.ArrayList;


public class Bateau {
	int taille;
	ArrayList<Case> bateau = new ArrayList<>();
	boolean etat;   //False = Non coulé , True = Coulé
	String joueur;
	
	public Bateau(){
		taille=0;
		etat=true;
		joueur="";
	}
	
	public Bateau(Coordonnees a, int taille, String joueur){
		for (int i=0;i<taille-1;i++){
			if (a.orientation){
				bateau.add(new Case(a.x,a.y+i));
			}
			else{
				bateau.add(new Case(a.x+i,a.y));
			}
		}
		this.joueur=joueur;
		this.etat=false;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	
}
