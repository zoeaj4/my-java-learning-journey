package gui.events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Learned how to handle events from multiple sources using Actions and how to bind keyboard shortcuts to trigger the same behavior as buttons.


public class MultiSourceEventTest {

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
		
		// buttons
		ColorAction yellowAction = new ColorAction("yellow", new ImageIcon("src/gui/events/yellowButton.png"), Color.YELLOW); 
		ColorAction blueAction = new ColorAction("blue", new ImageIcon("src/gui/events/blueButton.png"), Color.BLUE); 
		ColorAction redAction = new ColorAction("red", new ImageIcon("src/gui/events/redButton.png"), Color.RED);
		ColorAction magentaAction = new ColorAction("magenta", new ImageIcon("src/gui/events/magentaButton.jpg"), Color.MAGENTA);
		
		add(new JButton(yellowAction));
		add(new JButton(blueAction));
		add(new JButton(redAction));
		add(new JButton(magentaAction));
		
		
		
		// keyboard shortcuts
		InputMap inputMap= getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = getActionMap();
		
		
		// yellow
		inputMap.put(KeyStroke.getKeyStroke("ctrl Y"), "yellowBackground");
		actionMap.put("yellowBackground", yellowAction);
		
		// blue
		inputMap.put(KeyStroke.getKeyStroke("ctrl B"), "blueBackground");
		actionMap.put("blueBackground", blueAction);

		// red
		inputMap.put(KeyStroke.getKeyStroke("ctrl R"), "redBackground");
		actionMap.put("redBackground", redAction);
		
		// magenta
		inputMap.put(KeyStroke.getKeyStroke("ctrl M"), "magentaBackground");
		actionMap.put("magentaBackground", magentaAction);
		
		
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


