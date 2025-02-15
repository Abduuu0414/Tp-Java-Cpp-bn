package ma.package3.classes;

public class Professeur {
    private static int compteur = 1;
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private Specialite specialite;

    public Professeur(String nom, String prenom, String telephone, String email, Specialite specialite) {
        this.id = compteur++;
        this.nom = nom.toUpperCase();
        this.prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();
        this.telephone = telephone;
        this.email = email;
        this.specialite = specialite;
    }

    public Specialite getSpecialite() { return specialite; }

    @Override
    public String toString() {
        return nom + " " + prenom + " : " + email;
    }
}
