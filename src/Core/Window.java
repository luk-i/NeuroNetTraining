package Core;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	/*
	 * Variables
	 */
	
	public Window() {
        JFrame frame = new JFrame("Interact");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
	}
}
