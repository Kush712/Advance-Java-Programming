import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Frame;

/*
 * Practical 10 :WAP to demonstrate flow layout, border layout, card layout, Grid Layout.
 * @author Kush
 * Division : Q-C
 * Batch : Q-C1
 */
//Grid Layout
public class Ajp_pr10_C_QC1 extends Frame
{
    public static void main(String[] args)
    {
        Frame f = new Frame("Flow layout");
        f.setSize(400, 400);
        
        GridLayout fl = new GridLayout(2,2);
        f.setLayout(fl);
        
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        Button b4 = new Button("Button4");
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        
        f.setVisible(true);
        
    }
    
}
