import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Emoji extends Applet 
{
    public void paint(Graphics g) 
    {
        smiley(g, 50, 50);
        winky(g, 150, 50);
        surprised(g, 250, 50);
        sad(g, 350, 50);
        cool(g, 450, 50);
        heartEyes(g, 50, 150);
        tongueOut(g, 150, 150);
        sleepy(g, 250, 150);
        angry(g, 350, 150);
        cry(g, 450, 150);
    }

    public void smiley(Graphics g, int x, int y) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.BLACK);
        g.fillOval(x + 20, y + 20, 10, 10);
        g.fillOval(x + 50, y + 20, 10, 10);
        g.drawArc(x + 20, y + 40, 40, 20, 0, -180);
    }

    public void winky(Graphics g, int x, int y) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.BLACK);
        g.fillOval(x + 20, y + 20, 10, 10);
        g.drawLine(x + 50, y + 20, x + 60, y + 30);
        g.drawArc(x + 20, y + 40, 40, 20, 0, -180);
    }

    public void surprised(Graphics g, int x, int y) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.BLACK);
        g.fillOval(x + 20, y + 20, 10, 10);
        g.fillOval(x + 50, y + 20, 10, 10);
        g.drawOval(x + 35, y + 50, 10, 15);
    }

    public void sad(Graphics g, int x, int y) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.BLACK);
        g.fillOval(x + 20, y + 20, 10, 10);
        g.fillOval(x + 50, y + 20, 10, 10);
        g.drawArc(x + 20, y + 50, 40, 20, 0, 180);
    }

    public void cool(Graphics g, int x, int y) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.BLACK);
        g.fillRect(x + 15, y + 20, 20, 10);
        g.fillRect(x + 45, y + 20, 20, 10);
        g.drawLine(x + 35, y + 20, x + 45, y + 30);
        g.drawArc(x + 20, y + 40, 40, 20, 0, -180);
    }

    public void heartEyes(Graphics g, int x, int y) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.RED);
        g.fillOval(x + 20, y + 20, 15, 15);
        g.fillOval(x + 50, y + 20, 15, 15);
        g.setColor(Color.BLACK);
        g.drawArc(x + 20, y + 40, 40, 20, 0, -180);
    }

    public void tongueOut(Graphics g, int x, int y) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.BLACK);
        g.fillOval(x + 20, y + 20, 10, 10);
        g.fillOval(x + 50, y + 20, 10, 10);
        g.drawArc(x + 20, y + 40, 40, 20, 0, -180);
        g.setColor(Color.PINK);
        g.fillRect(x + 35, y + 50, 10, 15);
    }

    public void sleepy(Graphics g, int x, int y) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.BLACK);
        g.drawLine(x + 20, y + 25, x + 30, y + 25);
        g.drawLine(x + 50, y + 25, x + 60, y + 25);
        g.drawArc(x + 20, y + 50, 40, 20, 0, 180);
    }

    public void angry(Graphics g, int x, int y) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.BLACK);
        g.drawLine(x + 20, y + 20, x + 30, y + 30);
        g.drawLine(x + 50, y + 20, x + 60, y + 30);
        g.fillOval(x + 20, y + 30, 10, 10);
        g.fillOval(x + 50, y + 30, 10, 10);
        g.drawArc(x + 20, y + 50, 40, 20, 0, 180);
    }

    public void cry(Graphics g, int x, int y) 
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 80, 80);
        g.setColor(Color.BLACK);
        g.fillOval(x + 20, y + 20, 10, 10);
        g.fillOval(x + 50, y + 20, 10, 10);
        g.drawArc(x + 20, y + 50, 40, 20, 0, 180);
        g.setColor(Color.BLUE);
        g.drawLine(x + 25, y + 40, x + 25, y + 60);
    }
}
