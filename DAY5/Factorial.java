import java.util.Scanner;
class Main
{
 int i;
 int mult=1;
 void fact(int n)
 {
  for(i=1;i<n;i++)
  {
   mult=mult*i;
   System.out.println("the factorial is:"+mult);
  }
 }
class Factorial
   {
     public static void main(String args[])
    {
        Scanner ram=new Scanner(System.in);
        int n;
        System.out.println("the n value is:");
        n=ram.nextInt();	
        Main a1=new Main();
        a1.fact(n);
     }
   }
}