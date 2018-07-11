import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class Aeroplane extends Canvas implements KeyListener,Runnable 
{
	JFrame f;
	Graphics g;
	Thread t;
	int rx=5;
        int ry=5;	
	String d;
	String p="s";
	Aeroplane()
	{
		System.out.println("Constructor");
		t=new Thread(this);
		f=new JFrame("Aeroplane game");
		f.setBounds(0,0,1600,1000);
		this.setBounds(0,0,1600,800);
		this.setBackground(Color.green);
		t.addKeyListener(this);
		f.add(this);
		f.setLayout(null);
		f.setVisible(true);
	 }
	public void keyTyped(KeyEvent e5)
	{
   
	}
	public void keyReleased(KeyEvent e7)
	{

	}
	public void keyPressed(KeyEvent e4)
	{
		
			if(e4.getKeyChar()==KeyEvent.VK_PAGE_UP)
			{
				System.out.println("hello");
				d="forward";
				if(p.equals("s"))
				{
					t.start();
				}
				else 
				{ 
				  if(e4.getKeyChar()==KeyEvent.VK_SPACE)
					{
						t.resume();
				 	}
					t.resume();
				  }
				
			}

			else
			{
				t.suspend();
				p="stop";
				f.setEnabled(true);
				}
				else
				{
					if(p.equals("stop"))
					{
						t.resume();	
					}
					d="back";
				}
			}
	    
	}
	public void run()
	{
		while(true)
		{
			if(d.equals("forward"))
			{
				rx+=1;
				ry-=1;
			}
			else
			{
				rx-=1;
				ry+=1;
			}
			repaint();	
			try
			{
				if((ry+300)==800)
				{
					t.sleep(5000);
				}
				else
				{
					t.sleep(10);
				}
			}
			catch(Exception e)	
			{

			
			}
		}
	}
	public void paint(Graphics g)
	{
		Toolkit t=Toolkit.getDefaultToolkit();
		int a[]={650,650,680,680,710,710},b[]={800,700,700,650,650,800};
		int c[]={750,750,780,780,810,810},d[]={800,660,660,500,500,800};
		int f[]={850,850,880,880,910,910},h[]={800,750,750,660,660,800};
  		int p[]={rx+245,rx+370,rx+445,rx+545,rx+445,rx+370,rx+245,rx+295,rx+295},q[]={ry+495,ry+595,ry+595,ry+645,ry+695,ry+695,ry+795,ry+695,ry+595};
		int v[]={rx+295,rx+295,rx+115,rx+45,rx+75,rx+45,rx+115},w[]={ry+595,ry+695,ry+675,ry+715,ry+645,ry+575,ry+615};
		if((ry+300)<800)
		{

			System.out.println("Run");
			g.drawPolygon(a,b,6);
                        g.fillPolygon(a,b,6);
  			g.drawPolygon(c,d,6);
			g.fillPolygon(c,d,6);
			g.drawPolygon(f,h,6);
			g.fillPolygon(f,h,6);
			g.setColor(Color.blue);
    			g.drawPolygon(p,q,9);
			g.fillPolygon(p,q,9);
			g.setColor(Color.blue);
                  }
	    
	 }
         public static void main (String st[])
         {
                   Aeroplane A=new Aeroplane();
	 }
}
