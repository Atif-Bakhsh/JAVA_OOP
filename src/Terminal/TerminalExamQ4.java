package Terminal;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TerminalExamQ4 {
    public static void main(String[] args) {
        JButton button = new JButton("Click Me"); // Event source: JButton

        ActionListener listener = new ActionListener() { // Event handler: ActionListener
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!"); // Event handling logic
            }
        };

        button.addActionListener(listener); // Registering the event: associating the event source with the event handler
    }
}
