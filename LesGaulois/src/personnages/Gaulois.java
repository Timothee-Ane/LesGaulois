package personnages;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private Integer effetPotion = 1;
	private Village village;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	} 
	
	public String getNom() {
		return nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la machoire de " + nomRomain);
		romain.recevoirCoup(force * effetPotion / 3);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
		}
		
	}
	
	public void boirePotion(Integer forcePotion) {
		this.effetPotion = forcePotion;
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}

	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void sePresenter() {
		if (village != null) {
			if (village.getChef() == this) {
				System.out.println("Bonjour, je m'appelle " + nom + ". Je suis le chef du village : " + village.getNom() + ".");
			}
			else {
				System.out.println("Bonjour, je m'appelle " + nom + ". J'habite le village : " + village.getNom() + ".");
			}
		}
		else {
			System.out.println("Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.");
		}
	}
}