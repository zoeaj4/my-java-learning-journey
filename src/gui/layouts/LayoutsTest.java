package gui.layouts;

import java.awt.*;
import javax.swing.*;

public class LayoutsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LFrame lFrame = new LFrame();
	}

}

class LFrame extends JFrame{
	public LFrame() {
		setBounds(200,200,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new LayoutSheetFlow(),BorderLayout.NORTH);
		add(new LayoutSheetBorder(),BorderLayout.SOUTH);
	
		setVisible(true);
	}
}

class LayoutSheetFlow extends JPanel{
	public LayoutSheetFlow() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add (new JButton("yellow"));
		add (new JButton("blue"));
	}
	
}

class LayoutSheetBorder extends JPanel{
	public LayoutSheetBorder() {
		setLayout(new BorderLayout(10,10));
		add (new JButton("red"),BorderLayout.WEST);
		add (new JButton ("green"),BorderLayout.EAST);
		add (new JButton("black"),BorderLayout.CENTER);
		
	}
}
