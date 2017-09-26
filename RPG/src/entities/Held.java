package entities;

import items.*;

public class Held {

	public String name;
	public int hp_current;
	public int xp;
	public int level;
	public int skp; // Skillpunkte
	public String klasse;

	// Stats:
	public int hp_max;
	public int intelligence;
	public int strength;
	public int luck;
	// etc.

	// Items:
	public Waffe meineWaffe;
	public int gold;
	public int coins;
	public Boots meineBoots;
	public Chest meineChest;
	public Helmet meinHelmet;

	public Held(String name, int hp_current, int xp, int level, int skp, String klasse, int hp_max, int intelligence,
			int strength, int luck, Waffe meineWaffe, int gold, int coins, Boots meineBoots, Chest meineChest,
			Helmet meinHelmet) {
		super();
		this.name = name;
		this.hp_current = hp_current;
		this.xp = xp;
		this.level = level;
		this.skp = skp;
		this.klasse = klasse;
		this.hp_max = hp_max;
		this.intelligence = intelligence;
		this.strength = strength;
		this.luck = luck;
		this.meineWaffe = meineWaffe;
		this.gold = gold;
		this.coins = coins;
		this.meineBoots = meineBoots;
		this.meineChest = meineChest;
		this.meinHelmet = meinHelmet;
	}

	public String getName() {
		return name;
	}

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp_current() {
		return hp_current;
	}

	public void setHp_current(int hp_current) {
		this.hp_current = hp_current;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Waffe getMeineWaffe() {
		return meineWaffe;
	}

	public void setMeineWaffe(Waffe meineWaffe) {
		this.meineWaffe = meineWaffe;
	}

	public int getHp_max() {
		return hp_max;
	}

	public void setHp_max(int hp_max) {
		this.hp_max = hp_max;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

}
