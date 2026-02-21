package gui.events;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/*
 * This program was created as a learning exercise to understand how window events are handled in Java Swing.
 *
 * To build this application, I learned how to:
 * - Create multiple windows using JFrame and configure their size and title.
 * - Attach a WindowListener to a frame in order to react to window lifecycle events.
 * - Use the WindowAdapter class to avoid implementing all methods of the WindowListener interface.
 * - Override only the necessary event methods such as:
 *   windowOpened(), windowClosed(), and windowIconified().
 * - Work with the WindowEvent object to detect when the user opens, closes, or minimizes a window.
 * - Apply the event-driven programming model, where changes in the window state trigger
 *   specific actions in the program.
 *
 * The main goal of this program is to practice handling window events and to understand
 * how adapter classes simplify event listener implementations in Swing.
 */
public class WindowEventTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		WindowFrame windowFrame = new WindowFrame();
		windowFrame.setBounds(200,200,400,400);
		windowFrame.setTitle("window test 1");
		WindowFrame windowFrame2 = new WindowFrame();
		windowFrame2.setBounds(400,400,400,400);
		windowFrame2.setTitle("window test 2");

	}

}

class WindowFrame extends JFrame{
	
	public WindowFrame() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
/*		MWindow windowListener = new MWindow();
		addWindowListener(windowListener); */
		
		addWindowListener(new MWindow());
		
	}
	
}


class MWindow extends WindowAdapter {

    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened.");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed.");
    }

    public void windowIconified(WindowEvent e) {        
        System.out.println("Window minimized.");
    }
 
    
}
	