import java.util.Scanner;
class Sumn
{
 public static void main(String args[])
 {
  Scanner ram=new Scanner(System.in);
  int i=1;
  int n;
  int sum=0;
  System.out.println("enter n value:");
  n=ram.nextInt();
  while(i<=n)
  {
   sum=sum+i;
   i++;
  }
   System.out.println(sum);
 }
}