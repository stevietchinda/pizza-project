package package_personne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class ProgrammeMain {

	private static Statement st;

	public static Connection connectBD() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost/pizzadb?characterEncoding=latin1&useConfigs=maxPerformance";

		String login = "root";
		String passwd = "";

		Connection cn =null; 
		Statement st =null;
		ResultSet rs =null;
		
		Class.forName("com.mysql.jdbc.Driver");
		cn = DriverManager.getConnection(url, login, passwd);
		return cn;
	}
	
	
	public static ArrayList <Pizza> listePizza() {
		ArrayList <Pizza> pizzaList = new ArrayList<Pizza>();
		try {
			Connection cn = connectBD();
			// Etape 3 : Cr�ation d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM pizza";

			// Etape 4 : ex�cution requ�te
			ResultSet rs = st.executeQuery(sql);

			// Si r�cup donn�es alors �tapes 5 (parcours Resultset)
			while (rs.next()) {
				rs.getString(1);
				rs.getString(2);
				rs.getString(3);

				Pizza p1 = new Pizza(rs.getString(1), rs.getString(2), rs.getString(3));
				pizzaList.add(p1);
               // System.out.println(p1);
			}// fin de la boucle de la copie de la table pizza
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return pizzaList;
	}

	public static ArrayList <Ingredient> getIngredientListByNoPizz(String nropizz) {
		ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();
		try {
			Connection cn = connectBD();
			// Etape 3 : Cr�ation d'un statement
			st = cn.createStatement();
			String sql1 ="SELECT c.CODEINGR, i.NOMINGR, c.QTECOMP,i.UNITEINGR from pizza p, composer c, ingredient i \r\n"
					+ "WHERE p.nropizz=c.NROPIZZ and c.CODEINGR=i.CODEINGR and p.nropizz="+Integer.parseInt(nropizz);

			// Etape 4 : ex�cution requ�te
			ResultSet rs = st.executeQuery(sql1);

			// Si r�cup donn�es alors �tapes 5 (parcours Resultset)
			while (rs.next()) {
				rs.getString(1);
			    rs.getString(2);
				rs.getString(3);
				rs.getString(4);

				Ingredient I1 = new Ingredient(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				ingredientList.add(I1);

			}// fin de la boucle de la copie de la table pizza
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return ingredientList;

	}
	public static void afficher(ArrayList<Pizza> pizzas, ArrayList<Ingredient> ingredients) {
	    for (Pizza pizza : pizzas) {
	        System.out.println(pizza.toString());
	                for (Ingredient ingredient : ingredients) {
	                        System.out.println(ingredient.toString());
	                    }
	                }
	}
	
	public static void main(String[] args) {
		
		ArrayList <Pizza> pizzaList = listePizza();
		ArrayList<Ingredient> ingredientList = getIngredientListByNoPizz("1");
		System.out.println("\n*************LISTE DES PIZZAS AVEC PRIX + INGREDIENTS********");
        afficher(pizzaList, ingredientList);

	}// fin de la fonction main

}// fin de la classe


