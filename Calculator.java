import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Practical 11 : Write a program to design simple calculator with the use of grid layout.
 * @author Kush
 * Division : Q-C
 * Batch : Q-C1
 */

public class AJP_pr11_QC1 extends Frame implements ActionListener {
    // Declare components
    TextField number1, number2, result;
    Button addButton, subButton, mulButton, divButton;

    public AJP_pr11_QC1(){
        
        // Set layout
        setLayout(new GridLayout(5, 2, 5, 5));
        
        // Create and add components
        add(new Label("Number 1:"));
        number1 = new TextField();
        add(number1);
        
        add(new Label("Number 2:"));
        number2 = new TextField();
        add(number2);
        
        add(new Label("Result:"));
        result = new TextField();
        result.setEditable(false);
        add(result);
        
        // Add operation buttons
        addButton = new Button("+");
        addButton.addActionListener(this);
        add(addButton);
        
        subButton = new Button("-");
        subButton.addActionListener(this);
        add(subButton);
        
        mulButton = new Button("*");
        mulButton.addActionListener(this);
        add(mulButton);
        
        divButton = new Button("/");
        divButton.addActionListener(this);
        add(divButton);
        
        // Set frame properties
        setSize(400, 300);
        setVisible(true);
        
        // Handle window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            // Read numbers from text fields
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());
            int ans = 0;
            
            // Perform operation based on button pressed
            if (e.getSource() == addButton) {
                ans = num1 + num2;
            } else if (e.getSource() == subButton) {
                ans = num1 - num2;
            } else if (e.getSource() == mulButton) {
                ans = num1 * num2;
            } else if (e.getSource() == divButton) {
                ans = num1 / num2;
            }
            
            // Display result
            result.setText(String.valueOf(ans));
        
    }

    public static void main(String[] args) {
        new AJP_pr11_QC1();
    }
}
