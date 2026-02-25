package gui.events;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FocusWindowTest extends JFrame implements WindowFocusListener {



	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==frame1) {
			frame1.setTitle("i'm the focus");
		}else {
			frame2.setTitle("i'm the focus");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==frame1) {
			frame1.setTitle("");
		}else {
			frame2.setTitle("");
		}
		
	}
	
	public void start() {
		
		frame1 = new FocusWindowTest();
		frame2 = new FocusWindowTest();

		frame1.setBounds(300,  100,  600,  350);
		frame2.setBounds(1000, 100, 600, 350);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.addWindowFocusListener(this);
		frame2.addWindowFocusListener(this);
		
		frame1.setVisible(true);
		frame2.setVisible(true);		
	
	}

	
	FocusWindowTest frame1;
	FocusWindowTest frame2;
	
	
	
	public static void main(String[] args) {
		
		FocusWindowTest focusFrames = new FocusWindowTest();
		focusFrames.start();
		
	}

}
