package mounir;

import java.util.ArrayList;
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
	    static ArrayList<Article> mesArticles = new ArrayList<Article>();
	    
		
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
			Article kebab = new Article(nbKebab, "Kebab", priceKebab);
			mesArticles.add(kebab);
			
			break;
			
		
		
		case 2: 
			System.out.println("Combien de Chwarma voulez-vous ? ");
			nbChwarma = saisiNb.nextInt();
			Article chwarma = new Article(nbChwarma, "Chwarma", priceChwarma);
			mesArticles.add(chwarma);
			break;
		
		case 3: 
			System.out.println("Combien de Burgir voulez-vous ? ");
			nbBurgir = saisiNb.nextInt();
			Article burgir = new Article(nbBurgir, "Burgir", priceBurgir);
			mesArticles.add(burgir);
			
			break;
		
		case 4: 
			System.out.println("Combien de Tacos voulez-vous ? ");
			nbTacos = saisiNb.nextInt();
			Article tacos = new Article(nbTacos, "Tacos", priceTacos);
			mesArticles.add(tacos);
			break;

		
		case 5: 
			System.out.println("Combien de Frite voulez-vous ? ");
			nbFrite = saisiNb.nextInt();
			Article frite = new Article(nbFrite, "Frite", priceFrite);
			mesArticles.add(frite);
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
			System.out.println("**************************");
			System.out.println("***** Bienvenue Chez *****");
			System.out.println("*****  Snack Mounir  *****");
			System.out.println("**************************");
			System.out.println("**  Nombre   Type   Prix**");
			for(int i=0 ;i<=mesArticles.size()-1 ;i++) {
				System.out.println("**   "+ mesArticles.get(i).getQuantity() +"       "+mesArticles.get(i).getType() +"   "+mesArticles.get(i).getPrice()+"**");
				Somme+=mesArticles.get(i).getPrice() * mesArticles.get(i).getQuantity();
			}
			System.out.println("**************************");
			System.out.println("**************************");
			System.out.println("La somme total est de " + Somme + "€");
		
				}
				
			
		}
			
		
	}
		


