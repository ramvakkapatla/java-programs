import java.util.Scanner;
class Pattern2
{
 public static void main(String args[])
 {
  Scanner ram=new Scanner(System.in);
  int i=1;int j=1;
  int n;
  System.out.println("enter n value:");
  n=ram.nextInt();
  for(i=1;i<=n;i++)
  {
   for(j=1;j<=i;j++)
   {
   System.out.print("*");
   }
   System.out.println();
  }
 }
}