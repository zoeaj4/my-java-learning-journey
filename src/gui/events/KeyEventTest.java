package gui.events;

import java.awt.event.*;
import javax.swing.*;

/*
 * This program was created as a learning exercise to understand how keyboard events are handled in Java Swing.
 *
 * To build this application, I learned how to:
 * - Create a basic window using JFrame.
 * - Attach a KeyListener to a component in order to capture user keyboard input.
 * - Implement the KeyListener interface and override its three methods:
 *   keyTyped(), keyPressed(), and keyReleased().
 * - Use the KeyEvent object to retrieve information about the pressed key,
 *   such as the character (getKeyChar()) and the key code (getKeyCode()).
 * - Apply the event-driven programming model, where user actions trigger
 *   specific responses in the program.
 *
 * The main goal of this program is to practice handling keyboard events and
 * understand how listeners and events interact within a Swing application.
 */

public class KeyEventTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyFrame keyFrame = new KeyFrame();

	}

}
class KeyFrame extends JFrame{
	public KeyFrame() {
		setBounds(200,200,800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		KListener klistener = new KListener();
		addKeyListener(klistener);
		
	}
	
}

class KListener implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}