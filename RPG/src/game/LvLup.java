package game;

import entities.Held;

public class LvLup {

	public int xpmax;
	public Held meinHeld;

	public LvLup(int pxpmax, Held pmeinHeld) {
		this.xpmax = pxpmax;
		this.meinHeld = pmeinHeld;
	}

	public void lvlUpWerte() {
		meinHeld.xp = meinHeld.xp - xpmax;
		xpmax = xpmax / 2 + xpmax;
		meinHeld.level++;
		meinHeld.skp++;
		meinHeld.hp_current = meinHeld.hp_max;
	}

	public int getXpmax() {
		return xpmax;
	}

	public void setXpmax(int xpmax) {
		this.xpmax = 200;
	}

}
