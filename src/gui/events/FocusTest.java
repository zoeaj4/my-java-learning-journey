package gui.events;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * In this program, I learned how to use FocusListener to detect when a JTextField
 * gains or loses focus and handle focusGained and focusLost events.
 */

public class FocusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FocusFrame focusFrame = new FocusFrame();
	}

}

class FocusFrame extends JFrame {
	public FocusFrame() {
		setBounds(300,300,400,400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		add(new FocusSheet());
		setVisible(true);
	}
}

class FocusSheet extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		box1=new JTextField();
		box2=new JTextField();
		
		box1.setBounds(120,10,150,20);
		box2.setBounds(120,50,150,20);
		
		add(box1);
		add(box2);
		
		FocusListen focus= new FocusListen();
		box1.addFocusListener(focus);
		
		
	}
	
	private class FocusListen implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			System.out.println("Focus gained");
		}

		@Override
		public void focusLost(FocusEvent e) {
			System.out.println("Focus lost.");
		}
	}
	
	JTextField box1;
	JTextField box2;
}


