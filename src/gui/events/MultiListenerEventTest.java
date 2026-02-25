package gui.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MultiListenerEventTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MLFrame mlFrame = new MLFrame();

	}

}

class MLFrame extends JFrame{
	public MLFrame(){
		setBounds(900,200,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MLSheet mlSheet = new MLSheet();
		add(mlSheet);
		
		setVisible(true);
	}
}

class MLSheet extends JPanel{
	public MLSheet() {
		JButton openNew = new JButton("open new");
		add(openNew);
		
		closeAllButton = new JButton("close all");
		add(closeAllButton);
		
		NewListener newListener = new NewListener();
		openNew.addActionListener(newListener);
	}
	
	private class NewListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			PopUp popUp = new PopUp(closeAllButton);
			
		}
		
	}
	
	
	JButton closeAllButton;
}

class PopUp extends JFrame{
	public PopUp(JButton mainButton) {
		counter++;
		setTitle("window " + counter);
		setBounds(40*counter,40*counter,200,200);
		setVisible(true);
		
		CloseAll closeListener=new CloseAll();
		mainButton.addActionListener(closeListener);
		
	}
	
	private class CloseAll implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
		}
		
	}
	
	private static int counter=0;
	
}