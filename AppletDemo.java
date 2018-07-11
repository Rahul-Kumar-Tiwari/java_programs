import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AppletDemo extends Applet
{
   public class AppletDemo implements ActionListener
   { 
       JButton b1,b2;
       
	public void paint(Graphics g)
        {
           g.drawLine(0,200,600,200);
           g.drawLine(600,200,600,800);
           b1=new JButton("chat");
           b1.setBounds(620,200,100,25);
           g.add(b1);
         }
   }
}
/*
<html>
<head>
	<title>myfirstpage</title>
</head>
<body>
	<applet code="AppletDemo" height="800" width="900">
	</applet>
</body>
</html>
*/