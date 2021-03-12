package Etudiant;

public class Panda {
	private int tailleP;
	private int ageP;
	private String nomP;
	private String classeP;
	private String universP;
	private String PouvoirP;
	
	public Panda(int tailleP, int ageP, String nomP, String classeP, String universP, String PouvoirP) {
		this.tailleP = tailleP;
		this.ageP = ageP;
		this.nomP = nomP;
		this.classeP = classeP;
		this.universP = universP;
		this.PouvoirP = PouvoirP;
	}
	
	public String getNom() {
		return nomP;
	}
	
	public void sePresenter() {
		System.out.println( "\n" +"Je mappelle " + nomP + " je viens de l'univers " + universP + ". Je mesure " + tailleP + "cm et j'ai " + ageP + 
				" ans. " + "Je suis de classe " + classeP);
		System.out.println("Je possède " + PouvoirP + ", cela est mon pouvoir !");
	}
	
	public String toString() {
		return nomP + " " + classeP;
	}
}
