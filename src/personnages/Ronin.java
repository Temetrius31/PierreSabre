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
	
	public void provoquer(Yakuza adversaire) {
		if(adversaire.getReputation()<=honneur*2) {
			System.out.println(parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!"));
			System.out.println(parler("Je t’ai eu petit yakuza!"));
			int gain=adversaire.perdre();
			gagnerArgent(gain);
			honneur++;
		}else {
			System.out.println(parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup."));
			adversaire.gagner(getArgent());
			honneur--;
		}
	}

}
