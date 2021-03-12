package Etudiant;

import java.util.ArrayList;
import java.util.List;

public class Classe {

	List<Etudiant> classe; 
	
	public Classe () {
		this.classe = new ArrayList<Etudiant>();
	}
	public Etudiant getEtudiant(int index) {
		return classe.get(index);
	}
	public void addEtudiant(Etudiant etudiant) {
		classe.add(etudiant);
		System.out.println("Etudiant ajouté");
	}
	public void removeEtudiant(int index) {
		classe.remove(index);
		System.out.println("Etudiant enlevé");
	}
	public void presentClasse() {
		
	}
	
}
