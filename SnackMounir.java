package mounir;

import java.util.Scanner;

public class SnackMounir {	
		static Scanner saisiNb = new Scanner(System.in);
		static int nbKebab = 0;
		public static int nbChwarma = 0;
		static int nbBurgir = 0;
		static int nbTacos = 0 ;
		static int nbFrite = 0;
		
		static int priceKebab = 5 ;
		static int priceChwarma = 6 ; 
		static int priceBurgir = 4 ; 
		static int priceTacos = 7;
		static int priceFrite = 2;
		static int Somme;
		static boolean isChoiceStop = false;
		
	public static void main(String[] args) {
		while(!isChoiceStop) {
		System.out.println("Que voulez vous commander ?");
		int choix = 0;
		System.out.println("1- Kebab");
		System.out.println("2- Chwarma");
		System.out.println("3- Burgir");
		System.out.println("4- Tacos");
		System.out.println("5-Frite");
		System.out.print("Votre choix: ");
		choix = saisiNb.nextInt();
		switch(choix) {
		case 1: 
			System.out.println("Combien de Kebab voulez-vous ? ");
			nbKebab = saisiNb.nextInt();
			Somme+=(nbKebab * priceKebab);
			break;
			
		
		
		case 2: 
			System.out.println("Combien de Chwarma voulez-vous ? ");
			nbChwarma = saisiNb.nextInt();
			Somme+=(nbChwarma * priceChwarma);
			break;
		
		case 3: 
			System.out.println("Combien de Burgir voulez-vous ? ");
			nbBurgir = saisiNb.nextInt();
			Somme+=(nbBurgir * priceBurgir);
			break;
		
		case 4: 
			System.out.println("Combien de Tacos voulez-vous ? ");
			nbTacos = saisiNb.nextInt();
			Somme+=(nbTacos * priceTacos);
			break;

		
		case 5: 
			System.out.println("Combien de Frite voulez-vous ? ");
			nbFrite = saisiNb.nextInt();
			Somme+=(nbFrite * priceFrite);
			break;
			
		
		}
		choix();
		
	}
	}
	public static void choix() {
		int stop = 0;
		while(stop!=1 && stop != 2) {
			System.out.println("Voulez-vous arrêter votre choix?  ");
			stop = saisiNb.nextInt();
		}
		if(stop==2) {
			isChoiceStop= false;
		}
		else {
			isChoiceStop=true;
			
			System.out.println("La somme total est de " + Somme + "€");
		}
			
		
	}
		

}
