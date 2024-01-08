package package_personne;

public class Client extends Individu {
	
	public Client(int numero, String nom, String prenom, String code_postale, String adresse_client, String telephone) {
		super(numero, nom, prenom);
		this.code_postale = code_postale;
		this.adresse_client = adresse_client;
		this.telephone = telephone;
	}
	private String code_postale ;
	private String adresse_client ;
	private String telephone;
	public String getCode_postale() {
		return code_postale;
	}
	public void setCode_postale(String code_postale) {
		this.code_postale = code_postale;
	}
	public String getAdresse_client() {
		return adresse_client;
	}
	public void setAdresse_client(String adresse_client) {
		this.adresse_client = adresse_client;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Client [code_postale=" + code_postale + ", adresse_client=" + adresse_client + ", telephone="
				+ telephone + "]";
	}
	
	
	

}
