import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JFrame f1,f2;
        JTextField t1,t2,t3,t4;
        JTextArea a1,a2;
	JButton b1,b2;
	JPasswordField p1;
        JComboBox c1,c2;
	Login()
	{
		f1=new JFrame("login");
		f1.setBounds(600,300,600,400);
		l1=new JLabel("UserName");
		l1.setBounds(100,100,150,25);
		f1.add(l1);
		l1.setForeground(Color.red);

		Font f3=new Font("Times New Roman",Font.BOLD,30);
		l1.setFont(f3);

                t1=new JTextField();
                t1.setBounds(250,100,200,25);
                f1.add(t1);

                l2=new JLabel("Password");
                l2.setBounds(100,150,150,25);
                f1.add(l2);
                l2.setForeground(Color.blue);
		Font f4=new Font("Times New Roman",Font.BOLD,30);
		l2.setFont(f4);

                p1=new JPasswordField();
                p1.setBounds(250,150,200,25);
                f1.add(p1);
                

		b1=new JButton("login");
		b1.setBounds(150,250,100,25);
		f1.add(b1);
		

		b2=new JButton("signup");
		b2.setBounds(300,250,100,25);
		f1.add(b2);

		b2.addActionListener(this);		


                f1.setLayout(null);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e1)
	{
		if(e1.getSource()==b2)
		{
			new SignUp();
			f1.setVisible(false);
		}
		

	
	}
	public static void main(String st[])
	{
		new Login();
	}
}
