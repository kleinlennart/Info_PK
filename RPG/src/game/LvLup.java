package game;

public class LvLup {

	public int xpmax;
	public Held meineHeld;
	
	public LvLup(int pxpmax, Held pmeinHeld) 
	{
		this.xpmax = pxpmax;
		pmeinHeld = this.meineHeld;
	}

	public void lvlupwerte() 
	{
		xp=xp-xpmax; 
		xpmax=xpmax/2+xpmax;
		lvl++;
		skp++;
		meinHeld.hp_current=hpmax;
	}
	
	public int getXpmax() 
	{
		return xpmax;
	}

	public void setXpmax(int xpmax) 
	{
		this.xpmax = 200;
	}

	public Held getMeineHeld() 
	{
		return meineHeld;
	}

	public void setMeineHeld(Held meineHeld) 
	{
		this.meineHeld = meineHeld;
	}
	
	
}
