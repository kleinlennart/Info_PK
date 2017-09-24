package items;
import graphics.*; // Later Usage

public class Inventory {

	private static final Object NULL = null;

	public int slots;
	public Object[] contents = new Class[slots]; // Items im Inventar auf einem
													// Klassen (Items) Array
	// ++ layout variable typ graphics

	public Inventory(int slots, Object[] contents) {
		this.slots = slots;
		this.contents = contents;
	}

	public void ItemAufnehmen(int slot, Object item) {
		contents[slot] = item;
	}

	public Object ItemAbgeben(int slot) {
		Object item_onSlot = contents[slot];
		contents[slot] = NULL;
		return item_onSlot;
	}

	public int getSlots() {
		return slots;
	}

	public void setSlots(int slots) {
		this.slots = slots;
	}

	// generated for every Held class
	// size, content, layout

}
