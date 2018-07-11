import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
public class AppletAeroplane extends Applet
{

	public void paint(Graphics g)
	{
           int a[]={100,250,800,800,250},b[]={400,550,550,250,250};
           int c[]={400,950,700},d[]={550,790,550};
           int e[]={400,950,700},f[]={250,10,250};
           int h[]={800,1000,1000},i[]={400,400,200};
           //int r[]={800,1005,1005},s[]={400,610,190};
	   g.fillPolygon(a,b,5);
	   setBackground(Color.yellow);
           g.drawPolygon(c,d,3);
           g.fillPolygon(c,d,3);
           g.drawPolygon(e,f,3);
           g.fillPolygon(e,f,3);
           g.fillPolygon(e,f,3);
           g.drawPolygon(h,i,3);
           g.fillPolygon(h,i,3);
           g.drawArc(720,250,150,300,270,180);
           g.fillArc(720,250,150,300,270,180);
           setForeground(Color.red);
          
        }
 
}