package ma.projet.entites;

public class Complexe {
	
	private int x;
	private int y;
	

	public Complexe(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public Complexe plus(Complexe c) {
		return new Complexe(this.x + c.x, this.y + c.y);
	}


	public Complexe moins(Complexe c) {
		return new Complexe(this.x - c.x, this.y - c.y);
	}


	@Override
	public String toString() {
		if(y > 0)
			return (x + " + " + y + "i");
		else if(y < 0)
			return (x + " - " + -y + "i");
		else
			return (x + "");
	}
	
	
}
