package package_personne;

import java.util.ArrayList;

public class Composer {
	private String nropizz;
	private String codeingr;
	private String qtecomp;
	//private Ingredient codeing;
	//private Pizza nropizz;
	public Composer(String nropizz, String codeingr,String qtecomp) {
		super();
		this.nropizz = nropizz;
		this.codeingr = codeingr;
		this.qtecomp = qtecomp;
	}
	

	public String getNropizz() {
		return nropizz;
	}
	public void setNropizz(String nropizz) {
		this.nropizz = nropizz;
	}
	public String getCodeingr() {
		return codeingr;
	}
	public void setCodeingr(String codeingr) {
		this.codeingr = codeingr;
	}
	public String getQtecomp() {
		return qtecomp;
	}
	public void setQtecomp(String qtecomp) {
		this.qtecomp = qtecomp;
	}
	
	
	@Override
	public String toString() {
		return "Composer [nropizz=" + nropizz + ", codeingr=" + codeingr + ", qtecomp=" + qtecomp + "]";
	}
	
	


}


	

