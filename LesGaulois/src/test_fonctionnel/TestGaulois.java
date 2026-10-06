package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain minu = new Romain("Minus, 6)
		
		asterix.parler("Bonjour Obléix.");
		obelix.parler("Bonjours Astérix. Ça te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt " + asterix + " et " + obelix + " tombent nez-à-nez sue le romain" + minus);

		
	}
}
