package gui.basics;

import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

/*
 * Java Journal – First Swing Graphics Project
 * ------------------------------------------
 * 
 * This program is my first experiment using Swing and the Java 2D Graphics API
 * to create a graphical window and draw custom shapes on the screen.
 * 
 * I created a custom JFrame class (Frames) to represent the main application window.
 * The size and position of the frame are calculated dynamically using:
 *  - Toolkit: to access system resources (screen information)
 *  - Dimension: to obtain the screen resolution
 * 
 * This allows the window to be centered and scaled proportionally to the user’s screen.
 * 
 * I configured the frame with:
 *  - A title
 *  - Disabled resizing
 *  - EXIT_ON_CLOSE behavior
 *  - A custom icon loaded from an image file
 * 
 * I also created a custom JPanel subclass (Sheet) where I override paintComponent(Graphics g)
 * to perform custom drawing using Graphics2D.
 * 
 * In this panel I practiced:
 *  - Drawing and filling shapes (Rectangle2D, Ellipse2D, arcs, and lines)
 *  - Using custom colors and fonts
 *  - Drawing text on the screen
 *  - Loading and displaying an external image using ImageIO
 * 
 * This project helps me understand how JFrame, JPanel, and Graphics2D work together
 * to build simple graphical user interfaces and custom drawings in Swing.
 */

public class FrameTesting {

    public static void main(String[] args) {
        Frames frame1 = new Frames();
    }
}

class Frames extends JFrame {

    public Frames() {

        // Access system toolkit to get screen resolution
        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension screenSize = myScreen.getScreenSize();

        int heightScreen = screenSize.height;
        int widthScreen = screenSize.width;

        // Set window size and position relative to screen size
        setBounds(widthScreen / 4, heightScreen / 4, widthScreen / 2, heightScreen / 2);
        setResizable(false);
        setTitle("I'm a Frame");

        // Close application when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load and set custom window icon
        Image myIcon = myScreen.getImage("src/gui/basics/icon.jpg");
        setIconImage(myIcon);

        // Add custom drawing panel
        Sheet mySheet = new Sheet();
        add(mySheet);

        mySheet.setBackground(Color.cyan);
        setVisible(true);
    }
}

class Sheet extends JPanel {

    private Image image;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Convert Graphics to Graphics2D for advanced drawing
        Graphics2D g2 = (Graphics2D) g;

        // Draw ground (rectangle)
        g2.setPaint(new Color(120, 180, 120));
        g2.fillRect(0, 450, 950, 150);

        // Draw sun (ellipse)
        Ellipse2D sun = new Ellipse2D.Double(80, 60, 100, 100);
        g2.setPaint(Color.YELLOW);
        g2.fill(sun);

        // Draw a heart using arcs and lines
        g.setColor(Color.RED);
        g.drawArc(350, 150, 100, 100, 0, 180);
        g.drawArc(450, 150, 100, 100, 0, 180);
        g.drawLine(350, 200, 450, 350);
        g.drawLine(550, 200, 450, 350);

        // Draw text with custom font
        Font myFont = new Font("Arial", Font.ITALIC, 18);
        g2.setFont(myFont);
        g2.setPaint(Color.BLACK);
        g2.drawString("Learning Swing", 390, 260);

        // Decorative rectangle and circle
        Rectangle2D rectangle = new Rectangle2D.Double(50, 120, 300, 80);

        double Xcenter = rectangle.getCenterX();
        double Ycenter = rectangle.getCenterY();
        double radius = 120;

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(Xcenter, Ycenter, Xcenter + radius, Ycenter + radius);
        g2.setPaint(new Color(0, 140, 255).darker().darker());
        g2.draw(circle);

        // Cloud made from multiple ellipses
        g2.setPaint(Color.WHITE);

        Ellipse2D cloud1 = new Ellipse2D.Double(100, 140, 80, 60);
        Ellipse2D cloud2 = new Ellipse2D.Double(140, 120, 100, 80);
        Ellipse2D cloud3 = new Ellipse2D.Double(200, 140, 80, 60);
        Ellipse2D cloud4 = new Ellipse2D.Double(150, 160, 120, 60);

        g2.fill(cloud1);
        g2.fill(cloud2);
        g2.fill(cloud3);
        g2.fill(cloud4);

        // Load and draw external image (tree)
        try {
            image = ImageIO.read(new File("src/gui/basics/tree.png"));
        } catch (IOException e) {
            System.out.println("Image not found");
        }

        g2.drawImage(image, 570, 119, null);
    }
}
