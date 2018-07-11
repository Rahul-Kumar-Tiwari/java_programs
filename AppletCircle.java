import java.applet.Applet;
import java.awt.Graphics;
public class AppletCircle extends Applet
{
	public void paint(Graphics g)
	{
	   g.drawOval(50,100,500,500);
           g.drawLine(50,350,300,350); 
           g.drawString("r = 250 unit",300,650);
           g.fillOval(50,100,500,500);
        }
}