package ma.projet.entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Etudiant {
    private int id;
    private String code;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Filiere filiere;

    private static int comp = 0;

    public Etudiant(String code, String nom, String prenom, Date dateNaissance, Filiere filiere) {
        this.id = ++comp;
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filiere = filiere;
    }

    public Filiere getFiliere() {
		return filiere;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "id=" + id + ", code=" + code + ", nom=" + nom.toUpperCase() + 
               ", prenom=" + prenom + ", filiere=" + filiere.getLibelle() + 
               ", date de naissance : " + sdf.format(dateNaissance);
    }
}
