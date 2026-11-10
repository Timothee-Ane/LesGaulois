package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.isInvariantVerified() : "Force du Romain < 0 !";
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0 : "Préconditiion : la force du coup doit être strictement positive !";
		int force_temp = force;
		force = force - forceCoup;
		if (force <= 0) {
			parler("J'abandonne !");
		}
		else {
			parler("Aïe ! (force = " + force + ")");
		};
		assert force_temp > force : "la force n'a pas diminué !";
;		assert this.isInvariantVerified() : "Force du Romain < 0 !";
	}
	
	private boolean isInvariantVerified() {
		return (force >= 0);
	}

	//@Override
	//public String toString() {
	//	return nom;
	//}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
	}
}
