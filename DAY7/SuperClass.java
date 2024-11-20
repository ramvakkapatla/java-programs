class Demo
{
 int i=100;
}
class Demo1() extends Demo
{
 int i=200;
 void disp()
 {
  System.out.println("I value in super class " +super.i);
  System.out.println("I value in sub class :" +i);
 }
}
class SuperClass
{
 public static void main(String args[])
 {
  Demo1 ram=new Demo1();
     ram.disp();
 }
}