import java.util.Scanner;
class Dowhile
{
 public static void main(String args[])
 {
  Scanner ram=new Scanner(System.in);
  int i=1;
  int n;
  int mult=1;
  System.out.println("enter n value:");
  n=ram.nextInt();
  do
  {
     System.out.println(mult);
     mult=mult*i;
     i++;
  }while(i<=n);
 }
}