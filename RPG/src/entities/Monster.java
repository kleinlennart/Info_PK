package entities;

public class Monster {

	public int hp;
	public int hp_max;
	public int attack;
	public String name;

	public Monster(int hp, int hp_max, int attack, String name) {
		super();
		this.hp = hp;
		this.hp_max = hp_max;
		this.attack = attack;
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHp_max() {
		return hp_max;
	}

	public void setHp_max(int hp_max) {
		this.hp_max = hp_max;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
