import java.awt.*;
import javax.swing.*;
import java.sql.*; 
import java.awt.event.*;
public class CreateAccount implements ActionListener,FocusListener,KeyListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JFrame f1,f2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JTextArea a1,a2;
    JRadioButton rb1,rb2;
    JPanel jp1;
    JButton b1,b2;
    JPasswordField p1,p2;
    JComboBox cb1,cb2,cb3,cb4,cb5;
    JCheckBox c1,c2;
    String day[]={"day","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String month[]={"month","January","February","March","April","may","June","July","August","September","October","November","December"};
    String year[]={"year","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"};
    String phone[]={"mobile phone","Afganistan+93","Albaania+355","Algerea+213","American Soma+1684","India+91"};
    String location[]={"location","Afghanistan","Albaania","Algerea","American Soma","India","nepal","chaina"};
    CreateAccount()
    {
           f1=new JFrame("CreateAccount");
           f1.setBounds(500,10,800,1000);

           ImageIcon icon=new ImageIcon("D:/google.png");
	   l1=new JLabel(icon);
	   l1.setBounds(50,40,300,170);
	   f1.add(l1);

          l1=new JLabel("Create your Google Account");
	  l1.setBounds(50,220,800,70);
	  f1.add(l1);
	  l1.setForeground(Color.red);

	  Font f3=new Font("Times New Roman",Font.ITALIC,60);
	  l1.setFont(f3);

          l2=new JLabel("Name");
	  l2.setBounds(50,310,200,30);
	  f1.add(l2);
	  l2.setForeground(Color.black);
          Font f4=new Font("Times New Roman",Font.BOLD,30);
	  l2.setFont(f4);


          t1=new JTextField();
          t1.setBounds(50,350,150,25);
          f1.add(t1);

          t2=new JTextField();
          t2.setBounds(220,350,150,25);
          f1.add(t2);

          l3=new JLabel("Choose your username");
	  l3.setBounds(50,380,300,30);
	  f1.add(l3);
	  l3.setForeground(Color.black);
          Font f5=new Font("Times New Roman",Font.BOLD,30);
	  l3.setFont(f5);

          t3=new JTextField();
          t3.setBounds(50,420,320,25);
          f1.add(t3);
          t3.addKeyListener(this);
       
          l4=new JLabel("Create a password");
	  l4.setBounds(50,455,300,30);
	  f1.add(l4);
	  l4.setForeground(Color.black);
          Font f6=new Font("Times New Roman",Font.BOLD,30);
	  l4.setFont(f6);
           
          p1=new JPasswordField();
          p1.setBounds(50,490,320,25);
          f1.add(p1);
          
          l5=new JLabel("Confrim your password");
	  l5.setBounds(50,520,350,30);
	  f1.add(l5);
	  l5.setForeground(Color.black);
          Font f7=new Font("Times New Roman",Font.BOLD,30);
	  l5.setFont(f7);

          p2=new JPasswordField();
          p2.setBounds(50,555,320,25);
          f1.add(p2);
           
          l6=new JLabel("Birthday");
	  l6.setBounds(50,585,200,30);
	  f1.add(l6);
	  l6.setForeground(Color.black);
          Font f8=new Font("Times New Roman",Font.BOLD,30);
	  l6.setFont(f8);
         
           cb1=new JComboBox(month);
	   cb1.setBounds(50,620,120,25);
	   f1.add(cb1);

           cb2=new JComboBox(day);
	   cb2.setBounds(175,620,85,25);
	   f1.add(cb2);
            
           cb3=new JComboBox(year);
           cb3.setBounds(265,620,100,25);
	   f1.add(cb3);

                l7=new JLabel("Gender");
	        l7.setBounds(50,650,200,30);
	        f1.add(l7);
	        l7.setForeground(Color.black);
                Font f9=new Font("Times New Roman",Font.BOLD,30);
	        l7.setFont(f9);

                rb1=new JRadioButton("Male");
		rb1.setBounds(50,680,75,25);
		f1.add(rb1);
	
		rb2=new JRadioButton("Female");
		rb2.setBounds(170,680,75,25);
		f1.add(rb2);	

		ButtonGroup bg1=new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2); 
               jp1=new JPanel();
 		jp1.setBounds(200,773,170,25);
		f1.add(jp1);
	

          l8=new JLabel("Mobile phone");
	  l8.setBounds(50,710,350,30);
	  f1.add(l8);
	  l8.setForeground(Color.black);
          Font f10=new Font("Times New Roman",Font.BOLD,30);
	  l8.setFont(f10);

          cb4=new JComboBox(phone);
          cb4.setBounds(50,745,320,25);
	  f1.add(cb4);
          
          t6=new JTextField();
          t6.setBounds(50,775,320,25);
          f1.add(t6);
          t6.addFocusListener(this);
          l9=new JLabel("Location");
	  l9.setBounds(50,810,150,30);
	  f1.add(l9);
	  l9.setForeground(Color.black);
          Font f11=new Font("Times New Roman",Font.BOLD,30);
	  l9.setFont(f11);
         
          cb5=new JComboBox(location);
          cb5.setBounds(50,845,320,25);
	  f1.add(cb5);
   
         b1=new JButton("Continiue");
         b1.setBounds(50,880,320,25);
         f1.add(b1);
         b1.addActionListener(this);

          l10=new JLabel("Upload a profile picture");
	  l10.setBounds(420,705,400,30);
	  f1.add(l10);
	  l10.setForeground(Color.black);
          Font f12=new Font("Times New Roman",Font.BOLD,30);
	  l10.setFont(f12);
          ImageIcon camera=new ImageIcon("D:/rt.png");
	 
         b2=new JButton(camera);
         b2.setBounds(400,350,352,352);
         f1.add(b2);

          f1.setLayout(null);
          f1.setVisible(true);
          f1.setResizable(false);
         
       
         }
public void keyTyped(KeyEvent e5)
{
   
}
public void keyPressed(KeyEvent e4)
{
if(e4.getKeyCode()==KeyEvent.VK_1)
   {
     System.out.println("hii");
    }
}
public void keyReleased(KeyEvent e7)
{

}
  public  void focusGained(FocusEvent e14)
         {
      
         }
         public  void focusLost(FocusEvent e15)
         {
           if(t6.getText().equals("8")||t6.getText().equals("9")||t6.getText().equals("7")||t6.getText().equals("0")||t6.getText().equals(""))
           {
             	
               
            }
            else
            {
               l12=new JLabel("wrong mobile no ");
	       l12.setBounds(200,770,170,20);
	 	 jp1.add(l12);
	 	 l12.setBackground(Color.red);
         	 Font f15=new Font("Times New Roman",Font.BOLD,20);
	 	 l12.setFont(f15);
             }		
           

    }
    public void actionPerformed(ActionEvent e1)
    {
	if(e1.getSource()==b1)
        {
                  String name=t1.getText()+" "+t2.getText();
                  String username=t3.getText()+"@mygmail.com";
                  String password=p1.getText();
                  String password2=p2.getText();
                  String birthday=cb2.getSelectedItem()+"-"+cb1.getSelectedItem()+"-"+cb3.getSelectedItem();                  
                  String gender=null;
                  if(rb1.isSelected()==true)
			{
				gender="male";
			}
			else if(rb2.isSelected()==true)
			{
				gender="Female";
			}
                   String mobile=cb4.getSelectedItem()+" "+t6.getText();
		   String location=cb5.getSelectedItem()+" ";
                
	           if (name.equals("")||username.equals("")||password.equals("")||password2.equals(""))
                   {
                     JOptionPane.showMessageDialog(null,"plese fill all the field","ERROR WINDOW",JOptionPane.ERROR_MESSAGE);
                   }
                   else
                   {
                     if(password.equals(password2))
                     {
                       try
		       {
		     	  Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			  Statement st=con.createStatement();
                          String val="insert into signup values('"+username+"','"+name+"','"+password+"','"+birthday+"','"+gender+"','"+mobile+"','"+location+"')";
                          System.out.println(val);
                          st.executeUpdate(val);
                        }
		        catch(Exception e2)
		        {
                          System.out.println("exception="+e2);
		        }
                      }
                      else
                      {
                          JOptionPane.showMessageDialog(null,"password & confirm password must be same","ERROR WINDOW",JOptionPane.ERROR_MESSAGE);
                         //JOptionPane.showMessageDialog(null,"password & confirm password must be same","ERROR WINDOW",JOptionPane.INFORMATION_MESSAGE);	
                      }
                   }
                  // new AccountGenerated(username,password);
                   f1.setVisible(false);
        }		
    }  
     public static void main(String std[])
    {
		new CreateAccount();
     }
}



