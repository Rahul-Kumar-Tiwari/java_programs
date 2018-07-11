import java.util.Scanner;
class Bank
{
	String name,addr;
	double balance;
	Bank(String n,String a,double b)
	{
		name=n;
		addr=a;
		balance=b;
	}
	void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter name,addr and balance");
		name=in.next();
		addr=in.next();
		balance=in.nextDouble();
	}
	void show()
	{
		System.out.println("customer details");
		System.out.println("Name="+name);
		System.out.println("address="+addr);
		System.out.println("current Balance="+balance);
		System.out.println("amount u want to add");
		int i;
		Bank e2=new Bank("asdh","ksjd",20000+i);
		e2.show();
	}
	public static void main(String bnk[])
	{
		Bank e1=new Bank("asdh","ksjd",20000);
		e1.show();
 	}
}