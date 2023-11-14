package personnages;

public class Samourai extends Ronin {

	private String seigneur;

	public Samourai(String seigneur, String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
		this.seigneur = seigneur;
	}

	public String getSeigneur() {
		return seigneur;
	}

	@Override

	public void direBonjour() {
		System.out.println(
				parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoissonPref() + "."));
		System.out.println(parler("Je suis fier de servir le seigneur " + seigneur));
	}

	public void boire(String boisson) {

	}
}
