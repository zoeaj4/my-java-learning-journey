package gui.events;

import javax.swing.JFrame;

public class FocusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FocusFrame focusFrame = new FocusFrame();
	}

}

class FocusFrame extends JFrame {
	public FocusFrame() {
		setBounds(300,300,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}