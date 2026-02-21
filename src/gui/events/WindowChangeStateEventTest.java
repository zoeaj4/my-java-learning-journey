package gui.events;

import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;

/*
 * This program was created as a learning exercise to understand how window state events work in Java Swing.
 *
 * To build this application, I learned how to:
 * - Create a window using JFrame and configure its behavior with setBounds() and setDefaultCloseOperation().
 * - Use a WindowStateListener to detect changes in the window state (normal, minimized, or maximized).
 * - Implement the windowStateChanged() method to react when the window changes its state.
 * - Retrieve information from the WindowEvent object using getNewState().
 * - Compare window states with constants such as Frame.MAXIMIZED_BOTH, Frame.NORMAL, and Frame.ICONIFIED.
 * - Apply the event-driven programming model, where system actions (window resizing or minimizing)
 *   trigger specific responses in the program.
 *
 * The main goal of this program is to practice handling window state change events and
 * understand how Swing listeners respond to changes in the window lifecycle.
 */

public class WindowChangeStateEventTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StateWindow stateWindow = new StateWindow();
		
	}

}

class StateWindow extends JFrame{
	public StateWindow() {
		setBounds(200,200,400,400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		StateChanger stateChanger = new StateChanger();
		addWindowStateListener(stateChanger);
	}
}

class StateChanger implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		System.out.println("The window has changed state.");

		if (e.getNewState()==Frame.MAXIMIZED_BOTH) System.out.println("The window is in full screen.");
		else if (e.getNewState()==Frame.NORMAL) System.out.println("The window is at normal.");
		else if (e.getNewState()==Frame.ICONIFIED) System.out.println("The window is minimized.");
	
	}

}