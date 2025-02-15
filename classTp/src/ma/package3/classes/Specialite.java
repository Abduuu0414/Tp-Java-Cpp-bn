package ma.package3.classes;

public class Specialite {
    private static int compteur = 1;
    private int id;
    private String code;
    private String libelle;

    public Specialite(String code, String libelle) {
        this.id = compteur++;
        this.code = code;
        this.libelle = libelle;
    }

    public int getId() { return id; }
    public String getCode() { return code; }
    public String getLibelle() { return libelle; }

    @Override
    public String toString() {
        return "Spécialité " + libelle;
    }
}
