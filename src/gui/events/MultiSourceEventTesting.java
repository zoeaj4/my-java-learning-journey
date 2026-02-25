package gui.events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MultiSourceEventTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MSFrame msFrame = new MSFrame();
		
	}

}

class MSFrame extends JFrame{
	public MSFrame() {
		setBounds(200, 200, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MSSheet msSheet = new MSSheet();
		add(msSheet);
		
		setVisible(true);
	}
	
}

@SuppressWarnings("serial")
class MSSheet extends JPanel {
	public MSSheet () {
		ColorAction yellowAction = new ColorAction("yellow", new ImageIcon("src/gui/events/yellowButton.png"), Color.YELLOW); 
		ColorAction blueAction = new ColorAction("blue", new ImageIcon("src/gui/events/blueButton.png"), Color.BLUE); 
		ColorAction redAction = new ColorAction("red", new ImageIcon("src/gui/events/redButton.png"), Color.RED); 
		
		add(new JButton(yellowAction));
		add(new JButton(blueAction));
		add(new JButton(redAction));
	
		
	}

	private class ColorAction extends AbstractAction {

		public ColorAction(String name, Icon icon, Color colorButton) {
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "paint the sheet " + name);
			putValue("background", colorButton);
			
			}
		
		public void actionPerformed(ActionEvent e) {
			Color c=(Color)getValue("background");
			setBackground(c);
			System.out.println("name (color): " + getValue(Action.NAME) + " | description: " + getValue(Action.SHORT_DESCRIPTION));
			
		}
	}
}


