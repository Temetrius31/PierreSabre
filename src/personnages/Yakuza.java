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
	
}
