package package_personne;

public class Livreur extends Individu {

	private String dateEmbauche;
	

	public Livreur(int numero, String nom, String prenom, String dateEmbauche) {
		super(numero, nom, prenom);
		this.dateEmbauche = dateEmbauche;
	}

	public String getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	@Override
	public String toString() {
		return "Livreur [dateEmbauche=" + dateEmbauche + "]";
	}
	
	
	

	
}
