package project_pizza_ingrdient;

import java.util.ArrayList;



public class ProgrammeMain {

	public static void main(String[] args) {		
		ArrayList <Pizza> pizzaList = Controllers.listePizza();
		System.out.println("\n*************LISTE DES PIZZAS AVEC PRIX + INGREDIENTS********");
		for (Pizza pizza : pizzaList) {
			Controllers.afficher(pizza);
		}
	}// fin de la fonction main

}// fin de la classe


	
