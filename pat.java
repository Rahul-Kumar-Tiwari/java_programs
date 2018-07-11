import java.util.Scanner;
class Pattern
{	
	public static void main(String st[])
	{
		int i,j,n;
		System.out.println("enter no of lines you want");
		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}