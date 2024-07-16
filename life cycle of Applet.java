import java.applet.Applet;
import java.awt.Graphics;

/**
 * Practical 2 : WAP to demonstrate life cycle of Applet.
 * @author kush
 * Division : Q-C
 * Batch : Q-C1
 */
public class AJP_pr2_QC1 extends Applet 
{

    public void init() {
        System.out.println("Applet initialized");
    }
    
    public void start() {
        System.out.println("Applet started");
    }
    
    public void stop() {
        System.out.println("Applet stopped");
    }
    
    public void destroy() {
        System.out.println("Applet destroyed");
    }
    
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 50, 50);
    }
}