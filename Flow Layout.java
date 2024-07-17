import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Frame;

/*
 * Practical 10 :WAP to demonstrate flow layout, border layout, card layout, Grid Layout.
 * @author Kush
 * Division : Q-C
 * Batch : Q-C1
 */
//Flow Layout
public class Ajp_pr10_A_QC1 extends Frame
{
    public static void main(String[] args)
    {
        Frame f = new Frame("Flow layout");
        f.setSize(400, 400);
        
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT,10,10);
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
