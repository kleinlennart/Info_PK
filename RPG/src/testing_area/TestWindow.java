package testing_area;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ToolTipManager;

public class TestWindow {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWindow window = new TestWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TestWindow() {
		initialize();
	}

	public static final int WIDTH = 900;
	public static final int HEIGHT = 650;

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("RPG Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//		frame.setUndecorated(true);

		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));

		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		frame.setFocusable(true);

		ToolTipManager.sharedInstance().setInitialDelay(0);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(59, 73, 167, 154);
		frame.getContentPane().add(panel);

		JButton button = new JButton("") {
			@Override
			public Point getToolTipLocation(MouseEvent event) {
				return new Point(panel.getWidth() / 2, panel.getHeight() / 2);
			}
		};

		button.setBounds(59, 100, 167, 154);
		frame.getContentPane().add(button);
		button.setForeground(Color.WHITE);
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setToolTipText("Enter Shop");

		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);

		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(271, 79, 285, 229);
		frame.getContentPane().add(label);
	}
}
