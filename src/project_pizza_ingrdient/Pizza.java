package project_pizza_ingrdient;

import java.util.ArrayList;

public class Pizza {

		private String nroPizza;
		private String designPizza;
		private String tarifPizza;
		private ArrayList<Ingredient> maListeingredient;
		
	
		
		public Pizza(String nroPizza, String designPizza, String tarifPizza, ArrayList<Ingredient> maListeingredient) {
			super();
			this.nroPizza = nroPizza;
			this.designPizza = designPizza;
			this.tarifPizza = tarifPizza;
			this.maListeingredient = maListeingredient;
		}
		
		
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


		public ArrayList<Ingredient> getMaListeingredient() {
			return maListeingredient;
		}


		public void setMaListeingredient(ArrayList<Ingredient> maListeingredient) {
			this.maListeingredient = maListeingredient;
		}


		@Override
		public String toString() {
			return "Pizza [nroPizza=" + nroPizza + ", designPizza=" + designPizza + ", tarifPizza=" + tarifPizza
					+ ", maListeingredient=" + maListeingredient + "]";
		}

		}


