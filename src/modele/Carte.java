package modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;


public class Carte extends Observable {
	
	ArrayList<Bateau> listeBateaux = new ArrayList<Bateau>();  // Cest la liste des listelisteBateaux
	
	public String tir(Coordonnees c){
		Bateau bat = new Bateau();
		Case caseTemp = new Case(); 
		boolean test=false;
		boolean test2=false;
		String reponse="loup�";
		
		//On teste si les coordonn�es du tir correspondent au coordonn�es d'une des case d'un bateau
		Iterator<Bateau> itBateau = listeBateaux.iterator();
		Iterator<Case> itCase = bat.bateau.iterator();
		while (itBateau.hasNext() && test==false){
			bat=itBateau.next();
			while(itCase.hasNext() && test==false){
				caseTemp=itCase.next();
				if ((caseTemp.x==c.x) && (caseTemp.y==c.y)){
					test=true;
					reponse="coul�";
					caseTemp.setTouch�(true);
				}
			}
		}
		
		//on teste si le bateau est coul� ou pas
		Iterator<Case> itCase2 = bat.bateau.iterator();
		if (test==(true)){
			while(itCase2.hasNext() && test2==false){
				caseTemp=itCase2.next();
				if (caseTemp.touch�==true){
					test2=true;
					reponse="touch�";
				}
			}
		}
		notify();
		return reponse;
	}
	
	public boolean placer(Coordonnees c, int taille, String joueur){
		
		Bateau bat = new Bateau();
		Case caseTemp = new Case(); 
		boolean test=false;
		
		//On teste si les coordonn�es du tir correspondent au coordonn�es d'une des case d'un bateau qui existerait deja
		Iterator<Bateau> itBateau = listeBateaux.iterator();
		Iterator<Case> itCase = bat.bateau.iterator();
		while (itBateau.hasNext() && test==false){
			bat=itBateau.next();
			while(itCase.hasNext() && test==false){
				caseTemp=itCase.next();
				if ((caseTemp.x==c.x) && (caseTemp.y==c.y)){
					test=true;
				}
			}
		}
		
		//on cree le bateau dans la grille
		if (test){
			return false;
		}
		else{
			listeBateaux.add(new Bateau(c,taille,joueur));
			notify();
			return true;
		}
	}
}
