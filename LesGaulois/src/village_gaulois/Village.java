package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private Integer nbVillageois = 0;
	private Gaulois[] villageois;
	private Gaulois chef;
	
	public Village(String nom, int nbVillageoisMaximum, Gaulois chef) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.chef = chef;
		chef.setVillage(this);
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois ++;
			gaulois.setVillage(this);
		}
		else {
			System.out.println("Il n'y a plus de place dans le village \"" + nom + "\".");
		}
	}
	
	public Gaulois trouverVillageois(Integer numVillageois) {
		if (numVillageois > 0 && numVillageois <= nbVillageois) {
			return villageois[numVillageois - 1];
		}
		else {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
	}
	
	// D - Un main dans la classe Village
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", 30, abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillageois();
		
		// G - A nouveau dans le main de la classe Village
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillageois();
		Gaulois doublepolémix = new Gaulois("Doublepolémix", 4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolémix.sePresenter();
	}
	
	// E - Toujours dans la classe Village
	public void afficherVillageois() {
		System.out.println("Dans le village " + nom + " du chef " + chef + " vivent les légendaires gaulois :");
		for (Gaulois gaulois : villageois) {
			if(gaulois != null) {
				System.out.println(" - " + gaulois);
			}
		}
	}
	
	
	
}
