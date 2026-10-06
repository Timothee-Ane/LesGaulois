package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		
		asterix.parler("Bonjour Obléix.");
		obelix.parler("Bonjours Astérix. Ça te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");

		
	}
}
