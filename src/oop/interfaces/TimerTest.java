package oop.interfaces;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * The purpose of this code is to practice working with Java API interfaces,
 * specifically the ActionListener interface and its method actionPerformed().
 * 
 * I use a Timer object to trigger an event every few seconds and handle that
 * event through an implementation of the ActionListener interface.
 * This helps me understand how interfaces and event-driven programming work in Java.
 */

public class TimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GiveMeHour listener = new GiveMeHour();
		Timer myTimer = new Timer(1000, listener);
		myTimer.start();
		JOptionPane.showMessageDialog(null, "Press OK to stop");
		System.exit(0);
		
	}

}

class GiveMeHour implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Date now  = new Date();
		System.out.println("The time now is " + now);
		Toolkit.getDefaultToolkit().beep();
		
	}
}
