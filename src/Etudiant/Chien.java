package Etudiant;

public class Chien {
	private int taille;
	private int age;
	private String nom;
	private String race;
	
	public Chien(int taille, int age, String nom, String race) {
		this.taille = taille;
		this.age = age;
		this.nom = nom;
		this.race = race;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void sePresenter() {
		System.out.println("Je mappelle " + nom + " je suis un " + race + ". Je mesure " + taille + "cm et j'ai " + age + " ans.");	
	}
	
	public String toString() {
		return nom + " " + race;
	}
	
}
