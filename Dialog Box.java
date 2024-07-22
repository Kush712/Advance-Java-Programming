import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Practical 12 : WAP to create Dialog Box.
 * @author Kush
 * Division : Q-C
 * Batch : Q-C1
 */

public class AJP_pr12_QC1
{
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Dialog Box Example");

        // Set the frame's size
        frame.setSize(300, 200);

        // Create a panel to hold the button
        JPanel panel = new JPanel();

        // Create a button
        JButton button = new JButton("Click me!");

        // Add an action listener to the button
        button.addActionListener(e -> {
            // Show a dialog box with the message "hi Kush"
            JOptionPane.showMessageDialog(frame, "hi Kush");
        });
        
        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }
}
