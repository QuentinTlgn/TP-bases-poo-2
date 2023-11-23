package etudiant;

public class TestEtudiant {
	public static void main(String[] args) {
		String nom = args[0];
		Etudiant quentin = new Etudiant(nom);
		quentin.travailler();
		quentin.seReposer();
	}
}
