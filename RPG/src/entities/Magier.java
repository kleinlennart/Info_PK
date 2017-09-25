package entities;

import items.*;

public class Magier extends Held {

	private int mana_max;
	private int mana;
	private String element;



	public Magier(String name, int hp_current, int xp, int level, int skp, String klasse, int hp_max, int intelligence,
			int strength, int luck, Waffe meineWaffe, int gold, int coins, Boots meineBoots, Chest meineChest,
			Helmet meinHelmet, int mana_max, int mana, String element) {
		super(name, hp_current, xp, level, skp, klasse, hp_max, intelligence, strength, luck, meineWaffe, gold, coins,
				meineBoots, meineChest, meinHelmet);
		this.mana_max = mana_max;
		this.mana = mana;
		this.element = element;
	}

	public int getMana_max() {
		return mana_max;
	}

	public void setMana_max(int mana_max) {
		this.mana_max = mana_max;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

}
