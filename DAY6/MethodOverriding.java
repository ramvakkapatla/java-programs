class Overriding
{
 int n=100;
 void add()
 {
    System.out.println("The n value is :" +n);
 }
}
class Overriding1 extends Overriding
{
 int m=200;
 void add()
 {
    System.out.println("The m value is :" +m);
 }
}
class MethodOverriding
{
 public static void main(String args[])
 {
      Overriding a1=new Overriding();
      Overriding1 a2=new Overriding1();
      	Overriding p;
        p=a1;
      	a1.add();
        p=a2;
      	a2.add();
      	
 }
}