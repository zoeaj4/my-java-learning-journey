package gui.layouts;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorFrame calculator = new CalculatorFrame();
	}

}

class CalculatorFrame extends JFrame{
	public CalculatorFrame() {
		setTitle("calculator");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,400,400);
		add(new CalculatorSheet());
		
		
		setVisible(true);
	}
	
}

class CalculatorSheet extends JPanel{
	public CalculatorSheet() {
		beggining=true;
		setLayout(new BorderLayout());
		screen= new JButton("0");
		screen.setEnabled(false);
		add(screen,BorderLayout.NORTH);
		sheet2 = new JPanel();
		sheet2.setLayout(new GridLayout(4,4));
		
		ActionListener insert = new InsertNumber();
		
		putButton("7",insert); putButton("8",insert); putButton("9",insert); /*putButton("/");*/ putButton("4",insert); putButton("5",insert); putButton("6",insert); /*putButton("*");*/ putButton("1",insert); putButton("2",insert); putButton("3",insert);/* putButton("-");*/putButton("0",insert);putButton(".",insert);/*putButton("=");putButton("+")*/;
		
		
		
		add(sheet2,BorderLayout.CENTER);
	}
	
	private void putButton(String s,ActionListener listen) {
		JButton button = new JButton(s);
		button.addActionListener(listen);
		sheet2.add(button);
		
	}
	
	private class InsertNumber implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String input = e.getActionCommand();
			
			if (beggining) {
				screen.setText("");
				beggining=false;
			}
			screen.setText(screen.getText()+input);
			
		}
		
	}
	
	private JPanel sheet2;
	private JButton screen;
	private boolean beggining;
}