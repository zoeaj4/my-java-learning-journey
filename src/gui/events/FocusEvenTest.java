package gui.events;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* * In this program, I learned how to use FocusListener to detect when a JTextField * gains or loses focus and handle focusGained and focusLost events. */


public class FocusEvenTest {

    public static void main(String[] args) {
        FocusFrame focusFrame = new FocusFrame();
    }
}

class FocusFrame extends JFrame {
    public FocusFrame() {
        setBounds(300, 300, 400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(new FocusSheet());
        setVisible(true);
    }
}

class FocusSheet extends JPanel {

    JTextField box1;
    JTextField box2;

    public FocusSheet() {
        setLayout(null);

        box1 = new JTextField();
        box2 = new JTextField();

        box1.setBounds(120, 10, 150, 20);
        box2.setBounds(120, 50, 150, 20);

        add(box1);
        add(box2);

        FocusListen focus = new FocusListen();
        box1.addFocusListener(focus);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    private class FocusListen implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
        }

        @Override
        public void focusLost(FocusEvent e) {
            String email = box1.getText();

            if (email.contains("@")) {
                System.out.println("email confirmed");
            } else {
                System.out.println("you need an @.");
            }
        }
    }
}
