package BallGame;

import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame() {
		super("Ball Game");
		setVisible(true);
		setSize(500 , 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
}
