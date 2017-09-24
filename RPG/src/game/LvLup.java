package game;

import entities.Held;

public class LvLup {

	public int xpmax;
	public Held meineHeld;

	public LvLup(int pxpmax, Held pmeinHeld) {
		this.xpmax = pxpmax;
		this.meineHeld = pmeinHeld;
	}

	public void lvlUpWerte() {
		xp = xp - xpmax;
		xpmax = xpmax / 2 + xpmax;
		lvl++;
		skp++;
		meineHeld.hp_current = meineHeld.hp_max;
	}

	public int getXpmax() {
		return xpmax;
	}

	public void setXpmax(int xpmax) {
		this.xpmax = 200;
	}

	public Held getMeineHeld() {
		return meineHeld;
	}

	public void setMeineHeld(Held meineHeld) {
		this.meineHeld = meineHeld;
	}

}
