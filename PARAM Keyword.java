/*
<applet code="ajp_pr5_qc1.class"
width=1920 height="920">
<param name="a" value="10">
<param name="b" value="20">
</applet>
*/

import java.applet.Applet;
import java.awt.Graphics;

/*
 * @author Kush
 * Practical 4 : WAP to perform addition of two numbers using PARAM keyword.
 * Division : Q-C
 * Batch : Q-C1
 */

public class ajp_pr5_qc1 extends Applet {
	int a, b, c;
	String x, y;

	public void init() {

	}

	public void paint(Graphics g) {
		x = getParameter("a");
		y = getParameter("b");
		a = Integer.parseInt(x);
		b = Integer.parseInt(y);
		c = a + b;
		g.drawString("Ans is " + c, 50, 100);
	}
}