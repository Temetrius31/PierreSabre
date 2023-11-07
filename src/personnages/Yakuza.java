package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation = 0;
	
	
	public Yakuza(String nom, String boissonPref, int argent,String clan) {
		super(nom, boissonPref, argent);
		this.clan=clan;
	}


	public int getReputation() {
		return reputation;
	}


	public String getClan() {
		return clan;
	}
	
	public void extorquer(Commercant victime) {
		System.out.println(parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?"));
		System.out.println(parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !"));
		int gain=victime.seFaireExtorquer();
		gagnerArgent(gain);
		reputation++;
		System.out.println(
				parler("J'ai piqué les " + gain + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi!"));
	}
	
	
	public int perdre() {
		System.out.println(parler("J’ai perdu mon duel et mes " + getArgent() +" sous, snif... J'ai déshonoré le clan de " + clan +"."));
		int perte=getArgent();
		perdreArgent(perte);
		reputation--;
		return perte;
		
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		System.out.println(parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + getClan() + "? Je l'ai dépouillé de ses " + gain + " sous."));
	}
}
