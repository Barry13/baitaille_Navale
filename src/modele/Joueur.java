package modele;

public class Joueur {
	
	String nom;
	
	public Joueur(String nom){
		this.nom=nom;
	}
	
	public void tirer (Coordonnees c, Carte g){   //return
		g.tir(c);
	}
	
	public boolean placer (Coordonnees c, Bateau bat, Carte g){
		return( g.placer(c, bat.taille, this.nom) );
	}
}
