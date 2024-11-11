import java.util.Scanner;
class Fact
{
 public static void main(String args[])
 {
  Scanner ram=new Scanner(System.in);
  int i=1;
  int n;
  int mult=1;
  System.out.println("enter n value:");
  n=ram.nextInt();
  while(i<=n)
  {
   mult=mult*i;
   i++;
  }
   System.out.println(mult);
 }
}