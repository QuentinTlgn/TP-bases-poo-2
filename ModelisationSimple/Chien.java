package ModelisationSimple;

public class Chien {
	private String race = "Labrador";
	private Integer age = 8;
	private String couleur = "Marron";
	
	public void aboyer() {
		System.out.println("Ouaf !");
	}
	
	public void dormir() {
		System.out.println("Zzzzzzz");
	}

	public Chien(String race, Integer age, String couleur) {
		super();
		this.race = race;
		this.age = age;
		this.couleur = couleur;
	}
}
