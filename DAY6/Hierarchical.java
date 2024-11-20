import java.util.*;
class base
{
 Scanner ram=new Scanner(System.in);
 int n;
 void read1()
 {
  System.out.println("enter n value :" );
  n=ram.nextInt();
 }
}
class Derive1 extends base
{
 void fact()
 {
  int f=1,i;
  for(i=1;i<=n;i++)
  f=f*i;
  System.out.println("The factorial of given number is :" +f);
 }
}
class Derive2 extends base
{
 void sum()
 {
  int s=0,i;
  for(i=1;i<=n;i++)
  s=s+i;
  System.out.println("The sum of the given number is :"+s);
 }
}
class Hierarchical
{
 public static void main(String args[])
 {
  Derive1 d1=new Derive1();
  Derive2 d2=new Derive2();
      d1.read1();
      d1.fact();
      d2.read1();
      d2.sum();
 }
}