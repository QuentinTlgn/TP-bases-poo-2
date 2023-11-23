package segment;

public class Segment {
	private float extr1;
	private float extr2;
	
	public Segment(int extr1, int extr2) {
		this.extr1 = extr1;
		this.extr2 = extr2;
		verifierValeur(this.extr1, this.extr2);
	}
	
	private void verifierValeur(float extr1, float extr2) {
		if(extr1 > extr2) {
			throw new IllegalArgumentException("L'extremité 1 est supérieure à l'extrémité 2");
		}
	}
	
	
	
	
	
}
