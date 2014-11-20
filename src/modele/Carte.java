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
		String reponse="loupé";
		
		//On teste si les coordonnées du tir correspondent au coordonnées d'une des case d'un bateau
		Iterator<Bateau> itBateau = listeBateaux.iterator();
		Iterator<Case> itCase = bat.bateau.iterator();
		while (itBateau.hasNext() && test==false){
			bat=itBateau.next();
			while(itCase.hasNext() && test==false){
				caseTemp=itCase.next();
				if ((caseTemp.x==c.x) && (caseTemp.y==c.y)){
					test=true;
					reponse="coulé";
					caseTemp.setTouché(true);
				}
			}
		}
		
		//on teste si le bateau est coulé ou pas
		Iterator<Case> itCase2 = bat.bateau.iterator();
		if (test==(true)){
			while(itCase2.hasNext() && test2==false){
				caseTemp=itCase2.next();
				if (caseTemp.touché==true){
					test2=true;
					reponse="touché";
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
		
		//On teste si les coordonnées du tir correspondent au coordonnées d'une des case d'un bateau qui existerait deja
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
