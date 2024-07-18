import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Practical 13 : Develop an applet that contains one button. Initialize the label on the button to “start”,
When the user presses the button, which changes the label between these two values eachtime the button is pressed.
 * @author Kush
 * Division : Q-C
 * Batch : Q-C1
 */
public class AJP_pr13_QC1 extends Applet {
    public Button b;

    @Override
    public void init() {
        // Initialize the button with the label "start"
        b = new Button("start");

        // Add an action listener to handle the button click
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Toggle the button label between "start" and "stop"
                if (b.getLabel()== "start") {
                    b.setLabel("stop");
                } else {
                    b.setLabel("start");
                }
            }
        });
        // Add the button to the applet
        add(b);
    }
}
