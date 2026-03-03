package gui.swingcomponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextBoxFrame textBoxFrame = new TextBoxFrame();
		
	}

}

class TextBoxFrame extends JFrame{
	public TextBoxFrame() {
		setBounds(200,200,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new TextBoxSheet());
		
		
		setVisible(true);
	}
}

class TextBoxSheet extends JPanel{
	public TextBoxSheet() {
		
		JTextField textBox = new JTextField("default text", 20);
		
		add(textBox);
		
		// System.out.println(textBox.getText().trim());
		
		
		JButton printText = new JButton("PRINT THIS");
		add(printText);
		
	
	}
	
	private class PrintThis implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
				
	


}

}



