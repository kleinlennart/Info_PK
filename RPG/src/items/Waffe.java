package items;

public class Waffe 
{
	public int schadensbonus;
	public int haltbarkeitmax;
	public int haltbarkeit;
	public String name;
	public int bonus;
	public Waffe(int pSchadensbonus, int pHaltbarkeitmax, int pHaltbarkeit, String pName) 
	{
		this.schadensbonus = pSchadensbonus;
		this.haltbarkeitmax = pHaltbarkeitmax;
		this.haltbarkeit = pHaltbarkeit;
		this.name = pName;
	}
	public int getSchadensbonus() 
	{
		return schadensbonus;
	}
	public int getHaltbarkeit() 
	{
		return haltbarkeit;
	}
	public void setHaltbarkeit(int haltbarkeit) 
	{
		this.haltbarkeit = haltbarkeit;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setSchadensbonus(int schadensbonus) 
	{
		this.schadensbonus = schadensbonus;
	}
	public int getHaltbarkeitmax()
	{
		return haltbarkeitmax;
	}
	public void setHaltbarkeitmax(int haltbarkeitmax)
	{
		this.haltbarkeitmax = haltbarkeitmax;
	}
}
