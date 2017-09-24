package items;

public class Swords extends Waffe 
{
	public String material;
	public Swords(int pSchadensbonus, int pHaltbarkeitmax, int pHaltbarkeit, String pMaterial, String pName) 
	{
		super(pSchadensbonus, pHaltbarkeitmax, pHaltbarkeit, pName);
		material = pMaterial;
	}
	public String getMaterial() 
	{
		return material;
	}
	public void setMaterial(String material) 
	{
		this.material = material;
	}
	public void bonusBerechnen()
	{
		switch(material)
		{
		case "Holz": 	bonus = 5+schadensbonus;	break;
		case "Stein":	bonus = 10+schadensbonus;	break;
		case "Eisen":	bonus = 15+schadensbonus; 	break;
		case "Silber":	bonus = 20+schadensbonus;	break;
		case "Stahl":	bonus = 25+schadensbonus;	break;
		default : 		bonus = 0;					break;
		}
	}
}
