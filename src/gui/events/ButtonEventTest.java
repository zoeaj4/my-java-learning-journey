package gui.events;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

/*
 * This program was created as a learning exercise to understand how event handling works in Java Swing.
 *
 * To build this application, I learned how to:
 * - Create a basic Swing window using JFrame and JPanel.
 * - Add GUI components such as JButton to a panel.
 * - Use layout management implicitly through JPanel to organize components.
 * - Work with colors using the Color class.
 * - Implement the ActionListener interface to respond to user interactions.
 * - Handle events using inner classes, allowing each button to have its own behavior.
 * - Connect buttons to their corresponding actions with addActionListener().
 *
 * The main goal of this program is to practice the event-driven programming model in Swing,
 * where user actions (button clicks) trigger specific responses (changing the background color).
 * This example helped me understand how events, listeners, and GUI components interact in a Java application.
 */

public class ButtonEventTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ButtonFrames buttonFrame = new ButtonFrames();

	}

}

class ButtonFrames extends JFrame{
	public ButtonFrames() {
		setTitle("test buttons");
		setBounds(200,200,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ButtonSheet buttonSheet = new ButtonSheet();
		add(buttonSheet);
		
		setVisible(true);
	}
	
}

class ButtonSheet extends JPanel{
	
	JButton redButton = new JButton("Press for red");
	JButton yellowButton = new JButton("Press for yellow");
	JButton blueButton = new JButton("Press for blue");
	
	public ButtonSheet() {
		add(redButton);
		add(yellowButton);
		add(blueButton);
		
		BG yellow = new BG(Color.YELLOW);
		BG red = new BG(Color.RED);
		BG blue = new BG(Color.BLUE);
	
		redButton.addActionListener(red);
		yellowButton.addActionListener(yellow);
		blueButton.addActionListener(blue);
		}
	
		private class BG implements ActionListener {
		public BG (Color c) {
			background = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			setBackground(background);
		}
		private Color background;
	}

}


