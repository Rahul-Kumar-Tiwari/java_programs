import java.util.Scanner;
class Add 
 {
  int num1;
  int num2;
  int sum;
 
 void input()
 {
  Scanner in=new Scanner(System.in);
  System.out.println("please enter the first number");
  num1=in.nextInt();
  System.out.println("please enter the second number");
  num2=in.nextInt();               
 }
 void show()
 {
  System.out.println("the addition of two number is"+sum);
 }
 void calculation()
 {
 sum=num1+num2;
 } 
 public static void main(String st[])
 {
  Add a1=new Add();
  a1.input();
  a1.calculation();
  a1.show();
 }

 }