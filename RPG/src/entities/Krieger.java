package entities;

import items.Armor;
import items.Waffe;

public class Krieger extends Held {

	private int stamina;

	public Krieger(String name, int hp_current, int xp, int level, int skp, String klasse, int hp_max, int intelligence,
			int strength, int luck, Waffe meineWaffe, int gold, int coins, Armor meineArmor, int stamina) {
		super(name, hp_current, xp, level, skp, klasse, hp_max, intelligence, strength, luck, meineWaffe, gold, coins,
				meineArmor);
		this.stamina = stamina;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

}
