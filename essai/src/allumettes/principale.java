package allumettes;

import java.util.Scanner;


public class principale {

	public static void main(String[] args) {
		System.out.println("Bonjour! Bienvenue sur le jeu des allumettes");
		System.out.println("Veuillez entrer le nombre de joueurs svp");
		
		final  int NBALLUMETTES = 76;
		int nombreDeJoueurs = 0;
		Scanner sc = new Scanner(System.in);
		nombreDeJoueurs = sc.nextInt();
		sc.close();
		
		jeu nouveauJeu = new jeu();
		nouveauJeu.nombreDeJoueurs = nombreDeJoueurs;
		nouveauJeu.letas.nombreDAllumettesRestantes = NBALLUMETTES;
		
		joueur[] lesjoueurs = new joueur[nouveauJeu.nombreDeJoueurs];
		joueur moi = new joueur();
		
		int i = 0;
			while(i<nouveauJeu.nombreDeJoueurs){
				
		//int allumettesRestantes = moi.jouer(nouveauJeu.letas);
				lesjoueurs[i].jouer(nouveauJeu.letas);
				if(nouveauJeu.letas.nombreDAllumettesRestantes <= 0) System.out.println("Le joueur "+i+ "a perdu");
				i++;
				
			}
		//System.out.println(allumettesRestantes);
		
		
		//lesjoueurs[i].jouer(nouveauJeu.letas);
		
	}

}