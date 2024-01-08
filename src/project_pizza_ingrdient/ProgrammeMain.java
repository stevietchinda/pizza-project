package project_pizza_ingrdient;

import java.util.ArrayList;



public class ProgrammeMain {

	public static void main(String[] args) {		
		ArrayList <Pizza> pizzaList = Controllers.listePizza();
		for (Pizza pizza : pizzaList) {
			ArrayList<Ingredient> ingredientList = Controllers.getIngredientListByNoPizz(pizza.getNroPizza());
			Controllers.afficher(pizza, ingredientList);
		}
	}// fin de la fonction main

}// fin de la classe


	
