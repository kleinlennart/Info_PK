package game;

public class Wands extends Waffe
{
	private int magiewert;
	public Wands(int pSchadensbonus, int pHaltbarkeitmax, int pHaltbarkeit, String pName, int pMagiewert) 
	{
		super(pSchadensbonus, pHaltbarkeitmax, pHaltbarkeit, pName);
		magiewert = pMagiewert;
	}
	public int getMagiewert() 
	{
		return magiewert;
	}
	public void setMagiewert(int magiewert) 
	{
		this.magiewert = magiewert;
	}
	public void bonusBerechnen()
	{
		bonus = magiewert+schadensbonus;
	}
}
