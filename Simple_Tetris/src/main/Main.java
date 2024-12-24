package main;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
		// Make a Window
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);

		// Add Game_Panel to the Window
		Game_Panel gp = new Game_Panel();
		window.add(gp);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gp.launchGame(); // to drop the blocks
	}

}
