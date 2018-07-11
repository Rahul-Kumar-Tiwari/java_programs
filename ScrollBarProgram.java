import javax.swing.*;  
class ScrollBarProgram 
{  
   ScrollBarProgram() 
   {  
      JFrame f= new JFrame("ScrollbarProgram");  
      JScrollBar s=new JScrollBar();  
       s.setBounds(100,100, 200,200);  
        f.add(s);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
   }  
  public static void main(String args[])  
  {  
   new ScrollBarProgram();  
  }
}  