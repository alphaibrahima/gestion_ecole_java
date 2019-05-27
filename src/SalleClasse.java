import java.util.ArrayList;

public class SalleClasse {
	
	private static String nomDeClasse;
	private String niveau;
	
	public SalleClasse(String nomDeClasse, String niveau) {
		SalleClasse.nomDeClasse = nomDeClasse;
		this.niveau = niveau;
	}

	public static String getNomDeClasse() {
		return nomDeClasse;
	}

	public void setNomDeClasse(String nomDeClasse) {
		SalleClasse.nomDeClasse = nomDeClasse;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
}
