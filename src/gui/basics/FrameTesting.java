package gui.basics;

import java.awt.*;
import javax.swing.*;

/*
 * This program is my first experiment using Swing to create a graphical window in Java.
 * 
 * I created a custom JFrame class to define the main window of the application.
 * The window size and position are calculated based on the user's screen resolution
 * using Toolkit and Dimension, so the frame appears centered and scaled properly.
 * 
 * I configured the frame by setting its title, disabling resizing, defining the close
 * operation, and assigning a custom icon image.
 * 
 * I also created a JPanel subclass to draw custom graphics on the window.
 * Inside paintComponent, I used the Graphics object to draw text, arcs, and lines,
 * practicing basic 2D drawing and understanding how Swing handles painting.
 * 
 * This project helps me learn how frames, panels, and the Graphics API work together
 * in Swing to build simple graphical user interfaces.
 */

public class FrameTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames frame1 = new Frames();
	}

}

class Frames extends JFrame{
	
	public Frames() {
		
		Toolkit myScreen=Toolkit.getDefaultToolkit();
		Dimension screenSize = myScreen.getScreenSize();
		
		int heightScreen = screenSize.height;
		int widthScreen = screenSize.width;
		
		setBounds(widthScreen/4, heightScreen/4,widthScreen/2, heightScreen/2);		
		setResizable(false);
		setTitle("I'm a Frame");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Image myIcon = myScreen.getImage("src/gui/basics/icon.jpg");
		setIconImage(myIcon);

		Sheet mySheet = new Sheet();
		add(mySheet);
		
		setVisible(true);
		
	}

}

class Sheet extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Learning Swing", 210, 180);	
        g.drawArc(150, 100, 100, 100, 0, 180);
        g.drawArc(250, 100, 100, 100, 0, 180); 
        g.drawLine(150, 150, 250, 300);
        g.drawLine(350, 150, 250, 300);
	}
}

