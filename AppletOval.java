import java.applet.Applet;
import java.awt.Graphics;
public class AppletOval extends Applet
{
	public void paint(Graphics g)
	{
	   g.drawOval(50,100,500,300);
           g.drawLine(50,250,550,250);
           g.drawLine(300,100,300,400);
           g.drawString("500 unit",150,250);
           g.drawString("300 unit",300,200);
        }
}