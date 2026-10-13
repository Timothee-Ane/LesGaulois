package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour Obléix.");
		obelix.parler("Bonjours Astérix. Ça te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt " + asterix + " et " + obelix + " tombent nez-à-nez sur le romain " + minus.getNom() + ".");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		Romain brutus = new Romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);
		panoramix.fabriquerPotionn(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		asterix.frapper(brutus);
		asterix.frapper(brutus);
		asterix.frapper(brutus);
	}
}
