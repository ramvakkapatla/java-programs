import java.util.Scanner;
class Evenodd
{
 public static void main(String args[])
 {
  Scanner ram=new Scanner(System.in);
  int n;
  System.out.println("enter a value for n:");
  n=ram.nextInt();
  System.out.println("n="+n);
  if(n%2==0)
  {
  System.out.println("EVEN");
  }
  else
  {
  System.out.println("ODD");
  }
  
 }
}