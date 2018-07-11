import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class SignUp implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JFrame f1,f2,f7,f8;
        JTextField t1,t2,t3,t4;
        JTextArea a1,a2;
	JRadioButton rb1,rb2;
	JButton b1,b2;
	JPasswordField p1;
	String name=null;
        JComboBox cb1,cb2;
	JCheckBox c1,c2;
	JMenuBar mbr;
	JMenu m1;
	JMenuItem mi1;
	String day[]={"day","01","02","03","04","05"};
	SignUp()
	{
		f1=new JFrame("Signup");
		f1.setBounds(400,100,800,700);
		l1=new JLabel("Name:-");
		l1.setBounds(100,100,150,25);
		f1.add(l1);
		l1.setForeground(Color.red);

		mbr=new JMenuBar();
		mbr.setBounds(0,0,800,25);
		f1.add(mbr);

		m1=new JMenu("FILE");
		mbr.add(m1);
	
		mi1=new JMenuItem("NEW");
		m1.add(mi1);

		mi1=new JMenuItem("OPEN");
		m1.add(mi1);

		Font f3=new Font("Times New Roman",Font.BOLD,30);
		l1.setFont(f3);

                t1=new JTextField();
                t1.setBounds(250,100,200,25);
                f1.add(t1);

                l2=new JLabel("Gender");
                l2.setBounds(100,150,150,25);
                f1.add(l2);
                l2.setForeground(Color.blue);
		Font f4=new Font("Times New Roman",Font.BOLD,30);
		l2.setFont(f4);

		rb1=new JRadioButton("Male");
		rb1.setBounds(250,140,75,75);
		f1.add(rb1);
	
		rb2=new JRadioButton("Female");
		rb2.setBounds(350,140,75,75);
		f1.add(rb2);	

		ButtonGroup bg1=new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2); 
		
		l2=new JLabel("Course");
                l2.setBounds(100,200,150,25);
                f1.add(l2);
                l2.setForeground(Color.blue);
		Font f5=new Font("Times New Roman",Font.BOLD,30);
		l2.setFont(f5);
			
		c1=new JCheckBox("C");
		c1.setBounds(250,200,150,50);
		f1.add(c1);
		c2=new JCheckBox("Java");
		c2.setBounds(400,200,150,50);
		f1.add(c2);

		l2=new JLabel("DOB");
                l2.setBounds(100,275,150,25);
                f1.add(l2);
                l2.setForeground(Color.blue);
		Font f6=new Font("Times New Roman",Font.BOLD,30);
		l2.setFont(f6);

		cb1=new JComboBox(day);
		cb1.setBounds(250,275,100,25);
		f1.add(cb1);

			
		b1=new JButton("Submit");
		b1.setBounds(150,350,100,25);
		f1.add(b1);
		
		b1.addActionListener(this);

		b2=new JButton("clear");
		b2.setBounds(300,350,100,25);
		f1.add(b2);
		
		ImageIcon icon=new ImageIcon("D:/a.png");
		l1=new JLabel(icon);
		l1.setBounds(100,400,100,100);
		f1.add(l1);

                f1.setLayout(null);
		f1.setVisible(true);
	}
	private class ImageFilter extends javax.swing.filechooser.FileFilter
	{
	  	public boolean accept(File f)
	  	{
			if (f.isDirectory())
		            	return true;
			 String name = f.getName();
			 if (name.matches(".*((.jpg)|(.gif)|(.png))"))
			return true;
	        		else
	        		   return false;
		 }
		public String getDescription()
		{
			       return "Image files (*.jpg, *.gif, *.png)";
	    	}
	}
	public void actionPerformed(ActionEvent e1)
	{
		if(e1.getSource()==b1)
		{

			JFileChooser fc = new JFileChooser();
			fc.setFileFilter(new ImageFilter());
			int result = fc.showOpenDialog(null);
			File file = null;
	    		if (result == JFileChooser.APPROVE_OPTION)
	    		{
	       			file = fc.getSelectedFile();
				System.out.println(file);
	    			
			}


			/*String gen=null,g=null;
			name=t1.getText();
			System.out.println(name);
			
			if(rb1.isSelected()==true)
			{
				gen="male";
				System.out.println(gen);
			}
			else if(rb2.isSelected()==true)
			{
				gen="Female";
			}
			if(c1.isSelected()==true)
			{
				if(c2.isSelected()==true)
				{
					g="C"+" "+"JAVA";			
				}
				else
				{

					g="C";
				}
							
			}	
			else
			{
				g="JAVA";
			}
			//int x=cb1.getSelectedIndex();
			//String y=day[x];
			
			//System.out.println(y);
			//System.out.println(name);			
			if(name.equals(""))
			{
				//JOptionPane.showMessageDialog(null,"Please fill the name","ERROR WINDOW",JOptionPane.ERROR_MESSAGE);		
				//JOptionPane.showMessageDialog(null,"Please fill the name","ERROR WINDOW",JOptionPane.INFORMATION_MESSAGE);
				//int x=JOptionPane.showConfirmDialog(null,"Please fill the name","ERROR WINDOW",JOptionPane.YES_NO_OPTION);
				//if(x==JOptionPane.YES_OPTION)
				//{
				//	System.out.println("Yes");
				//}
				
				//String u=JOptionPane.showInputDialog("Password");
				//System.out.println(u);	
			}
			
			else
			{
				
			}*/
	
		}			
		
	}
	public static void main(String st[])
	{
		new SignUp();
	}
}
