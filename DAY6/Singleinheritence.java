class base
{
 protected int a,b,c;
 base()
 {
  a=10;
  b=20;
 }
 void add()
 {
  c=a+b;
  System.out.println("The addition1 is : " +c);
 }
}
class Derive extends base
{
 int d;
 void mult()
 {
  d=c*b;
  System.out.println("The addition2 is :" +d);
 }
}
class Singleinheritence
{
 public static void main(String args[])
 {
  Derive ram=new Derive();
  ram.add();
  ram.mult();
 }
}