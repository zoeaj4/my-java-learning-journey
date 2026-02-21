package gui.events;

import java.awt.event.*;

import javax.swing.*;
/*
 * In this program, I implemented mouse event handling using MouseListener,
 * MouseMotionListener, and MouseAdapter. I learned how to detect mouse movement,
 * dragging, clicks, button presses, and retrieve the cursor coordinates and click count.
 */
public class MouseEventTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseFrame mouseFrame = new MouseFrame();
	}

}

class MouseFrame extends JFrame{
	public MouseFrame() {
		setBounds(300,300,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MListener mlistener = new MListener();
		addMouseMotionListener(mlistener);
		
		MListener2 mlistener2 = new MListener2();
		addMouseListener(mlistener2);
		
		setVisible(true);
	}
}


class MListener implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You are dragging.");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You are moving.");
	}
	
}

class MListener2 extends MouseAdapter {
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Click");
		System.out.println("X coordinate: " + e.getX () + (" Y coordinate " + e.getY()));
		System.out.println("You clicked " + e.getClickCount() + " times" );
	}	
	
	
	public void mousePressed (MouseEvent e) {
		System.out.println(e.getModifiersEx());
		if (e.getModifiersEx()== 1024) {
		System.out.println("You pressed the left button.");	
		}
		else if (e.getModifiersEx()==2048) {
			System.out.println("You pressed the mouse wheel.");	
		}
		else if (e.getModifiersEx()==32768) {
			System.out.println("You pressed mouse button 4.");
		}
		else if (e.getModifiersEx()==16384) {
			System.out.println("You pressed mouse button 5.");
		}
		else {
			System.out.println("You pressed the right button.");
		}
		
	}
}

