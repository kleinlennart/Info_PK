package items;

public class Armor {
	public int dmgReduction;
	public int haltbarkeit;
	public int haltbarkeitMax;
	public String name;
	public String perk;

	public Armor(int pDmgReduction, int pHaltbarkeit, int pHaltbarkeitMax, String pName, String pPerk) {
		this.dmgReduction = pDmgReduction;
		this.haltbarkeit = pHaltbarkeit;
		this.haltbarkeitMax = pHaltbarkeitMax;
		this.name = pName;
		this.perk = pPerk;
	}

	public int getDmgReduction() {
		return dmgReduction;
	}

	public void setDmgReduction(int dmgReduction) {
		this.dmgReduction = dmgReduction;
	}

	public int getHaltbarkeit() {
		return haltbarkeit;
	}

	public void setHaltbarkeit(int haltbarkeit) {
		this.haltbarkeit = haltbarkeit;
	}

	public int getHaltbarkeitMax() {
		return haltbarkeitMax;
	}

	public void setHaltbarkeitMax(int haltbarkeitMax) {
		this.haltbarkeitMax = haltbarkeitMax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
