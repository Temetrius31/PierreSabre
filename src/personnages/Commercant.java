package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);

	}

	public int seFaireExtorquer() {
		int somme = getArgent();
		setArgent(0);
		System.out.println(parler("J'ai tout perdu! Le monde est vraiment trop injuste..."));
		return somme;
	}

	public void recevoir(int argent) {
		System.out.println(parler(argent + " sous ! Je te remercie g�n�reux donateur!"));
		int argentApres = getArgent() + argent;
		setArgent(argentApres);

	}

}
