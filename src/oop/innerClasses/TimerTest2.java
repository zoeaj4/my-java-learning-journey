package oop.innerClasses;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;
import java.awt.Toolkit;

/*
 * In this exercise, I practiced working with inner classes and interfaces in Java.
 *
 * I learned that an inner class can access method parameters and variables from its
 * enclosing scope without using getters or setters.
 * The inner class implements the ActionListener interface and reacts to timer events
 * by printing the current time and optionally playing a sound.
 *
 * I also practiced:
 * - Using local inner classes
 * - Implementing interfaces (ActionListener)
 * - Creating and starting a Timer
 * - Understanding encapsulation and scope
 *
 * I am still practicing interfaces and event-driven programming to improve my
 * understanding of how Java handles interactions and callbacks.
 */

public class TimerTest2 {

    public static void main(String[] args) {

        Clock myClock = new Clock();
        myClock.begin(2000, true);

        JOptionPane.showMessageDialog(null, "Press OK to stop");
    }
}

/*
 * This version of Clock uses a local inner class.
 * The inner class tellMeTheTime is declared inside the begin() method.
 *
 * This allows us to avoid declaring class fields and a constructor,
 * and instead use method parameters directly.
 *
 * Note: When a local inner class accesses a method parameter,
 * that parameter must be final or effectively final.
 *
 * In main(), since Clock has no constructor parameters,
 * the values are passed directly to the begin() method.
 */

class Clock {

    public void begin(int interval, final boolean sound) {

        class TellMeTheTime implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                Date now = new Date();
                System.out.println("I tell you the time every 2 seconds: " + now);

                if (sound) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener listener = new TellMeTheTime();
        Timer myTimer = new Timer(interval, listener);
        myTimer.start();
    }
}

