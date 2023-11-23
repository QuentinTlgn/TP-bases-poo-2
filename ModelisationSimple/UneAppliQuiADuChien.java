package ModelisationSimple;

public class UneAppliQuiADuChien {
	public static void main(String[] args) {
		Chien medor = new Chien("fox-terrier",3,"beige");
		medor.aboyer();
		medor.dormir();
		System.out.println("medor est un "+medor.getRace());
	}
}
