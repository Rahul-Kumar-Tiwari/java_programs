class PatternDemo
{ 
  public static void main(String st[])
  {
      String x="ignou";
      char ch[];
      int i,j;
      ch=new char[x.length()];
      for(i=0;i<x.length();i++)
      {
       ch[i]=x.charAt(i);
      }
      for(i=0;i<x.length();i++)
      {
          for(j=0;j<=i;j++)
          {
            System.out.print(ch[j]);
          }
          System.out.println();
      }
  }
}
    
   
 
