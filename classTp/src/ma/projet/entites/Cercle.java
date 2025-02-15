package ma.projet.entites;

public class Cercle {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    public boolean contient(Point p) {
        return Point.distance(centre, p) <= rayon;
    }

    @Override
    public String toString() {
        return "Cercle[centre=" + centre + ", rayon=" + rayon + "]";
    }
}
