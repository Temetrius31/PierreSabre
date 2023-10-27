package personnages;

public class Humain {

	private String nom;
	private String boissonPref;
	private int argent;

	public Humain(String nom, String boissonPref, int argent) {
		super();
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		System.out.println(parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPref + "."));
	}

	public void boire() {
		System.out.println(parler("Mmmm, un bon verre de " + boissonPref + "! GLOUPS !"));
	}

	public void acheter(String bien, int prix) {
		if (argent < prix) {
			System.out.println(parler("Je n'ai plus que " + argent
					+ " sous en poche. Je ne peux m�me pas m'offrir un kimono � " + prix + " sous."));
		} else {
			int argentAvant = argent;
			perdreArgent(prix);
			System.out.println(parler("J'ai " + argentAvant + " sous en poche. Je vais pouvoir m'offrir " + bien + " � "
					+ prix + " sous"));
		}
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	private String parler(String texte) {
		return "(" + nom + ") -" + texte;
	}
}