package ModelisationSimple;

public class Chien {
	private String race;
	private Integer age;
	private String couleur;
	
	public void aboyer() {
		System.out.println("Ouaf !");
	}
	
	public void dormir() {
		System.out.println("Zzzzzzz");
	}
	
	public String getRace() {
		return race;
	}

	public Chien(String race, Integer age, String couleur) {
		super();
		this.race = race;
		this.age = age;
		this.couleur = couleur;
	}
}
