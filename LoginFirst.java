import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class LoginFirst implements ActionListener
{ 
    JLabel l1,l2,l3,l4;
    JFrame f1,f2;
    JTextField t1,t2;
    JPasswordField p1;
    JButton b1,b2;
    String n2;
    LoginFirst()
    {     
         ImageIcon =new image
         f1=new JFrame("login");
         f1.setBounds(400,200,800,550);
         f1.
         l1=new JLabel("One account.All of Google.");
         l1.setBounds(50,40,700,100);
         f1.add(l1);
         Font f3=new Font("Times New Roman",Font.ITALIC,60);
         l1.setFont(f3);
          
         l2=new JLabel("Email or phone");
         l2.setBounds(250,310,200,50);
         f1.add(l2);
         l2.setForeground(Color.blue);
	 Font f4=new Font("Times New Roman",Font.BOLD,50);
          
         t1=new JTextField();
         t1.setBounds(350,320,200,25);
         f1.add(t1);

         
        
         b1=new JButton("Next");
         b1.setBounds(250,360,300,25);
         f1.add(b1);
	 b1.addActionListener(this);	

         b2=new JButton("Create account");
         b2.setBounds(250,410,300,25);
         f1.add(b2);

         
	  b2.addActionListener(this);
       
       
         ImageIcon icon=new ImageIcon("D:/abc.png");
         l1=new JLabel(icon);
         l1.setBounds(325,150,135,125);
	 f1.add(l1);   	
	  f1.setLayout(null);
          f1.setVisible(true);
	  f1.setResizable(false);
	

    }
    public void actionPerformed(ActionEvent e1)
    {
		if(e1.getSource()==b1)
                {
                  String name=t1.getText();
                  try
                  {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement st=con.createStatement();                  
                        String username=null,password=null;
			String val2="select signup_username,signup_password,signup_name from signup where signup_username='"+name+"'";			
			ResultSet rs=st.executeQuery(val2);
			while(rs.next())
			{
				username=rs.getString("signup_username");
				password=rs.getString("signup_password");
                                n2=rs.getString("signup_name");
			}
			if(name.equals(username))
			{
				new PasswordDemo(password,name,n2);
                                //new GmailOpening(n1);
				f1.setVisible(false);
			}
			else
			{
		          JOptionPane.showMessageDialog(null," please fill a valid username ","ERROR WINDOW",JOptionPane.INFORMATION_MESSAGE);
			 }
                        
                   }
                   catch(Exception e2)
		   {
			System.out.println("Exception="+e2);
		   }
	
                }
                if(e1.getSource()==b2)
                {
                        new CreateAccount();
                        f1.setVisible(false);
                 }
                

     }
     public static void main(String st[])
     {
       new LoginFirst();
     }
}

