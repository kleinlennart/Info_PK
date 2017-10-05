package game;

import java.awt.EventQueue;
import graphic.Window;

//Main Class starting and controlling the game

public class Game {

	public Game() {
		init();
	}

	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public static void main(String[] args) {
		Game game = new Game();
	}

}
