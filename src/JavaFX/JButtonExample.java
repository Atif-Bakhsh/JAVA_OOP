package JavaFX;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonExample {
    public static void main(String[] args) {
        // Create a JFrame to hold the button
        JFrame frame = new JFrame("JButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Set the position and size of the button
        button.setBounds(50, 50, 100, 30);

        // Add the button to the frame
        frame.add(button);

        // Set the size and visibility of the frame
        frame.setSize(200, 150);
        frame.setLayout(null); // Use absolute positioning
        frame.setVisible(true);
    }
}

