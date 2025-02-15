package ma.projet.test;

import ma.projet.entites.Filiere;
import ma.projet.entites.Etudiant;
import java.util.Date;

public class TestEtudiant {

	public static void main(String[] args) {
		Filiere filieres[] = new Filiere[3];
		filieres[0] = new Filiere("Info", "informatique");
		filieres[1] = new Filiere("SVT", "svt");
		filieres[2] = new Filiere("Math", "math");

		Etudiant etudiants[] = new Etudiant[3];
		etudiants[0] = new Etudiant("Info", "bouanani", "abderrahman", new Date (14/12/2004), filieres[0]);
		etudiants[1] = new Etudiant("SVT", "abou-laiche", "amine", new Date (14/12/2004), filieres[1]);
		etudiants[2] = new Etudiant("Math", "salihi", "yassine", new Date (14/12/2004), filieres[0]);
		
		                                                                                         
		System.out.println(filieres[0].getClass().getSimpleName());
		
		
        for (Filiere f : filieres) {
            System.out.println("Filière: " + f.getLibelle());
            for (Etudiant e : etudiants) {
                if (e.getFiliere().equals(f)) {
                    System.out.println(e.toString());
                }
            }
        }
	}
}
