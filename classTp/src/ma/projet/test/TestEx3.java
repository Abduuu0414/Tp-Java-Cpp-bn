package ma.projet.test;

import java.util.ArrayList;
import ma.package3.classes.Professeur;
import ma.package3.classes.Specialite;


public class TestEx3 {
    public static void main(String[] args) {
        ArrayList<Specialite> specialites = new ArrayList<>();//ici j'ai utilise la bibliotique arraylist (liste dynamique) pour une taille flexible
        specialites.add(new Specialite("JAVA", "JAVA/JEE"));
        specialites.add(new Specialite(".NET", ".NET"));
        specialites.add(new Specialite("GEST", "Gestion de projet"));
        specialites.add(new Specialite("CISCO", "CISCO"));
        specialites.add(new Specialite("PHP", "PHP"));

        ArrayList<Professeur> professeurs = new ArrayList<>();
        professeurs.add(new Professeur("Saifi", "Amel", "123456789", "amel@gmail.com", specialites.get(0)));
        professeurs.add(new Professeur("Alami", "Said", "987654321", "said@yahoo.fr", specialites.get(0)));
        professeurs.add(new Professeur("Alaoui", "Reda", "456123789", "alaoui@yahoo.fr", specialites.get(3)));
        professeurs.add(new Professeur("Kamali", "Imane", "321654987", "kamali@gmail.com", specialites.get(3)));

        for (Specialite specialite : specialites) {
            System.out.println(specialite);
            for (Professeur professeur : professeurs) {
                if (professeur.getSpecialite().equals(specialite)) {
                    System.out.println("- " + professeur);
                }
            }
            System.out.println();
        }
    }
}

