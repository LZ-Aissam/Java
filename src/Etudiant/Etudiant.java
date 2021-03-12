package Etudiant;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	private String nom;
	private String prenom;
	private int age;
	private String classe;
	List<Chien> chenil;

	public Etudiant(String nom, String prenom, int age, String classe) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.classe = classe;
		this.chenil = new ArrayList<Chien>();
		
	}
	
	public void sePresenter() {	
		System.out.println("Je m'appelle " + nom + " " + prenom + ", j'ai " + age + " et je suis en " + classe + ". \n Maintenant je laisse mon/mes chien(s) se présenter. \n");
		
		for(int i = 0; i < chenil.size(); i++) {
			chenil.get(i).sePresenter();
		}
	}
	
	public void AddChien(Chien chien) {
		chenil.add(chien);
	}

	public static Etudiant get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
