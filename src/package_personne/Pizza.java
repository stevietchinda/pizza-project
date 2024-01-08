package package_personne;

import java.util.ArrayList;

public class Pizza {
	private String nroPizza;
	private String designPizza;
	private String tarifPizza;
	
	public Pizza(String nroPizza, String designPizza, String tarifPizza) {
		super();
		this.nroPizza = nroPizza;
		this.designPizza = designPizza;
		this.tarifPizza = tarifPizza;
	}
	  /*System.out.println("PIzza : " + pizza.toString());
	        System.out.println("Ingredient : " + ingredient.toString());
	        System.out.println("Composer: " + composer.toString());	
			*/
		
	public String getNroPizza() {
		return nroPizza;
	}
	public void setNroPizza(String nroPizza) {
		this.nroPizza = nroPizza;
	}
	public String getDesignPizza() {
		return designPizza;
	}
	public void setDesignPizza(String designPizza) {
		this.designPizza = designPizza;
	}
	public String getTarifPizza() {
		return tarifPizza;
	}
	public void setTarifPizza(String tarifPizza) {
		this.tarifPizza = tarifPizza;
	}
	@Override
	public String toString() {
		return ""
				+ "\nLa pizza numero " + nroPizza + " avec pour code < " + designPizza + " >" 
	+ " coûte " + tarifPizza + " €\n" +"Elle est composée de: ";
	}
	
	
	}
	
	


