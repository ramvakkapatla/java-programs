import java.util.Scanner;
class Table
{
 public static void main(String args[])
 {
   Scanner ram=new Scanner(System.in);
   int i=1;
   int n;
   System.out.println("enter n value:");
   n=ram.nextInt();
   for(i=1;i<=n;i++)
   {
      System.out.println(n+"X"+i+"="+(i*n));
   }
 }
}
