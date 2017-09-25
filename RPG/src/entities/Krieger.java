package entities;

import items.Armor;
import items.Boots;
import items.Chest;
import items.Helmet;
import items.Waffe;

public class Krieger extends Held {

	private int stamina;



	public Krieger(String name, int hp_current, int xp, int level, int skp, String klasse, int hp_max, int intelligence,
			int strength, int luck, Waffe meineWaffe, int gold, int coins, Boots meineBoots, Chest meineChest,
			Helmet meinHelmet, int stamina) {
		super(name, hp_current, xp, level, skp, klasse, hp_max, intelligence, strength, luck, meineWaffe, gold, coins,
				meineBoots, meineChest, meinHelmet);
		this.stamina = stamina;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

}
