package personnages;

public class Chaudron {
	private Integer quantite;
	private Integer forcePotion;
	
	// Le constructeur de Chaudron est implicitement créer, instancié à 0.

	public void remplirChaudron(Integer quantite, Integer forcePotion) {
		this.quantite = quantite;
		this.forcePotion = forcePotion;
	}
	
	public Boolean resterPotion() {
		return quantite > 0;
		
	}
	
	public Integer prendreLouche() {
		if (resterPotion()) {
			quantite -= 1;
		}
		else {
			forcePotion = 0;
		}
		return forcePotion;
	}
}
