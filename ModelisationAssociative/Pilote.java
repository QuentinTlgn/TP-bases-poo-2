package ModelisationAssociative;

public class Pilote {
	private String nom;
	private int age;
	
	public void conduire() {
		System.out.println("Je conduis");
	}
	
	public Pilote (String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
}
