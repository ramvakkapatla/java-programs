import java.util.Scanner;
class Nestedif
{
 public static void main(String args[])
 {
  Scanner ram=new Scanner(System.in);
  int a,b,c;
  System.out.println("enter a value");
  a=ram.nextInt();
  System.out.println("enter b value");
  b=ram.nextInt();
  System.out.println("enter c value");
  c=ram.nextInt();
  	if(a>b)
	{
	 if(a>c)
	{
	 System.out.println("a is big");
	}
	else
	{
	 System.out.println("c is big");
	}
	} 
	else
	if(b>c)
	{
	 System.out.println("b is big");
	}
	else
	{
	 System.out.println("c is big");
	}
 }
}