package game;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		JLabel label = new JLabel("Hallo");
		JFrame gui = new JFrame();
		gui.add(label);
		gui.setLayout(null);
		label.setBounds(0, 0, 100, 25);
		gui.setSize(500, 300);
		gui.setLocationRelativeTo(null);
		gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);
		gui.setTitle("That cool RPG Game");
		gui.setResizable(true);

		// gui.pack();

		gui.setVisible(true);

	}

}
