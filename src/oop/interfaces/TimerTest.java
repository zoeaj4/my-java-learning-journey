package oop.interfaces;

import java.awt.event.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GiveMeHour listener = new GiveMeHour();
		Timer myTimer = new Timer(5000, listener);
		myTimer.start();
		JOptionPane.showMessageDialog(null, "Press OK to stop");
		System.exit(0);
		
	}

}

class GiveMeHour implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Date now  = new Date();
		System.out.println("The time now is " + now);
	}
}
