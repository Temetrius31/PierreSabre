package personnages;

public class Ronin extends Humain {
	
	private int honneur=1;
	
	

	public Ronin(String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
		
	}
	
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		System.out.println(parler(beneficiaire.getNom() + " prends ces " + don + " sous."));
		beneficiaire.recevoir(don);
		perdreArgent(don);
		
	}

}
