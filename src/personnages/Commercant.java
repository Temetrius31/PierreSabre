package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);

	}

	public int seFaireExtorquer() {
		int somme = getArgent();
		perdreArgent(somme);
		System.out.println(parler("J'ai tout perdu! Le monde est vraiment trop injuste..."));
		return somme;
	}

	public void recevoir(int argent) {
		System.out.println(parler(argent + " sous ! Je te remercie généreux donateur!"));
		gagnerArgent(argent);

	}

}
