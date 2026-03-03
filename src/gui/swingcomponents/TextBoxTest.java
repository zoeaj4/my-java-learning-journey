package gui.swingcomponents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * This project helped me learn how to use Swing components such as JFrame, JPanel,
 * JTextField, JLabel, and JButton to build a simple graphical user interface.
 *
 * I learned how event handling works in Java using ActionListener and the
 * actionPerformed method to respond to button clicks.
 *
 * This program connects user input from a text field with basic validation logic,
 * demonstrating the fundamentals of event-driven programming in Java.
 */


public class TextBoxTest {

    public static void main(String[] args) {
        // Create the main application window
        TextBoxFrame textBoxFrame = new TextBoxFrame();
    }
}

@SuppressWarnings("serial")
class TextBoxFrame extends JFrame {

    public TextBoxFrame() {
        // Set window size and position
        setBounds(200, 200, 800, 800);

        // Close the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the main panel to the frame
        add(new TextBoxSheet());

        // Make the window visible
        setVisible(true);
    }
}

@SuppressWarnings("serial")
class TextBoxSheet extends JPanel {

    // Text field where the user types the email
    private JTextField textBox;

    // Label used to display the validation result
    private JLabel result;

    public TextBoxSheet() {

        // Set the main layout of this panel
        setLayout(new BorderLayout());

        // Panel that holds the input components
        JPanel sheet = new JPanel();
        sheet.setLayout(new FlowLayout());

        // Label that shows the result (valid or invalid email)
        result = new JLabel("...", JLabel.CENTER);

        // Instruction label for the user
        JLabel instruction = new JLabel("For the email to be valid, you must enter an @.");

        sheet.add(instruction);

        // Create the text field with 20 columns
        textBox = new JTextField(20);
        sheet.add(textBox);

        // Add the result label to the center of the panel
        add(result, BorderLayout.CENTER);

        // Create the button that validates the email
        JButton printText = new JButton("VALIDATE");

        // Attach the ActionListener to the button
        printText.addActionListener(new PrintThis());

        sheet.add(printText);

        // Add the input panel to the top of the main panel
        add(sheet, BorderLayout.NORTH);
    }

    // Inner class that handles button click events
    private class PrintThis implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            // Counter for the number of '@' characters
            int amount = 0;

            // Get and trim the user input
            String userEmail = textBox.getText().trim();

            // Loop through each character of the string
            for (int i = 0; i < userEmail.length(); i++) {

                // Count how many '@' characters exist
                if (userEmail.charAt(i) == '@') {
                    amount++;
                }
            }

            // Validate the email based on the number of '@'
            if (amount == 1) {
                result.setText("email validated.");
            } else {
                result.setText("invalid email.");
            }
        }
    }
}
