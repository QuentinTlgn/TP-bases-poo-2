package ModelisationAssociative;

public class Voiture {
	private String modele;
	private float prix;
	private Pilote pilote;
	
	public Voiture(String modele, float prix, Pilote pilote) {
		this.modele = modele;
		this.pilote = pilote;
		this.prix = prix;
	}
	
	public void demarrer() {
		System.out.println("La voiture démarre !");
	}
	
	public void arreter() {
		System.out.println("La voiture s'arrête !");
	}
	
	public void seDeplacer() {
		System.out.println("Vrouuum");
		pilote.conduire();
	}	
}
