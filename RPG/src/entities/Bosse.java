package entities;

import graphics.Bars; //Important!

public class Bosse extends Monster {

	// Special attributes
	public Bars healthBar;
	public int mana;
	public String bossName;
	public String perks;
	public String element;

	public Bosse(int hp, int hp_max, int attack, String name, Bars healthBar, int mana, String bossName, String perks,
			String element) {
		super(hp, hp_max, attack, name);
		this.healthBar = healthBar;
		this.mana = mana;
		this.bossName = bossName;
		this.perks = perks;
		this.element = element;
	}

	public Bars getHealthBar() {
		return healthBar;
	}

	public void setHealthBar(Bars healthBar) {
		this.healthBar = healthBar;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public String getBossName() {
		return bossName;
	}

	public void setBossName(String bossName) {
		this.bossName = bossName;
	}

	public String getPerks() {
		return perks;
	}

	public void setPerks(String perks) {
		this.perks = perks;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}
	
	

}
