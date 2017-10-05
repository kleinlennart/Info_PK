package graphic;

import java.awt.Dimension;

import javax.swing.JFrame;

// Default Window Creator Class
public class Window {

	public JFrame frame;

	public Window() {
		initialize();
	}

	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;

	// All presets for mainWindow
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("RPG Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));

		frame.setResizable(false);
		// frame.setLocation(0,0); // For accurate Location on Mac (top left)
		frame.setLocationRelativeTo(null);

		frame.setFocusable(true);

	}
}
