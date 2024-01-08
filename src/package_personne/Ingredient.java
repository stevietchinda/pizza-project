package package_personne;

public class Ingredient {
	
private String codeingr;	
private String nomingr;
private String uniteingr;
private String qtecomp;

public Ingredient(String codeingr, String nomingr, String uniteingr, String qtecomp) {
	super();
	this.codeingr = codeingr;
	this.nomingr = nomingr;
	this.uniteingr = uniteingr;
	this.qtecomp = qtecomp;
}
public String getCodeingr() {
	return codeingr;
}
public void setCodeingr(String codeingr) {
	this.codeingr = codeingr;
}
public String getNomingr() {
	return nomingr;
}
public void setNomingr(String nomingr) {
	this.nomingr = nomingr;
}
public String getUniteingr() {
	return uniteingr;
}
public void setUniteingr(String uniteingr) {
	this.uniteingr = uniteingr;
}
public String getQtecomp() {
	return qtecomp;
}
public void setQtecomp(String qtecomp) {
	this.qtecomp = qtecomp;
}
@Override
public String toString() {
	return "-- " + codeingr + ", " + nomingr + " ( " + uniteingr + " "+ qtecomp + ")";
}


}
