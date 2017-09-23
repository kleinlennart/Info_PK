package game;

public class LvLup {

	public int xpmax;

	
	public LvLup(int pxpmax) {
		super();
		this.xpmax = pxpmax;
	}

	public void lvlupwerte() 
	{
		xp=xp-xpmax; 
		xpmax=xpmax/2+xpmax;
		lvl++;
		skp++;
		hp_current=hpmax;
	}
	
	public int getXpmax() 
	{
		return xpmax;
	}

	public void setXpmax(int xpmax) 
	{
		this.xpmax = 200;
	}
	
	
}
