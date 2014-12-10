package allumettes;

import java.util.Scanner;


public class joueur {
	
	int nombreDAllumettesAvantJeu;
	int nombreDAllumettesApresJeu;
	String nomDuJoueur;
	boolean aLaMain;
	
	
	int jouer(tasDAllumettes letas){
		
		System.out.println("Veuillez entrer le nombre d'allumettes à enlever svp");
		Scanner sc = new Scanner(System.in);
		//int nombreDAllumettesPrises = sc.nextInt();
		int nombreDAllumettesPrises = 2;
		sc.close();
		letas.nombreDAllumettesRestantes = letas.nombreDAllumettesRestantes - nombreDAllumettesPrises;
		return letas.nombreDAllumettesRestantes;
		
	}
	
	
	
}
