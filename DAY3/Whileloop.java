import java.util.Scanner;
class Whileloop
{
 public static void main(String args[])
 {
  Scanner ram=new Scanner(System.in);
  int i=1;
  int n;
  System.out.println("enter n value:");
  n=ram.nextInt();
  while(i<=n)
  {
   System.out.println(i);
   i++;
  }
 }
}