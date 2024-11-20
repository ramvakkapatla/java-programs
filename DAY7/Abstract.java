abstract class absdemo
{
 abstract void calculate(int n);
}
class absdemo1 extends absdemo
{
 void calculate(int n)
 {
  System.out.println("The square of the number is :" +n*n);
 }
}
class absdemo2 extends absdemo
{
 void calculate(int n)
 {
  System.out.println("The cube of the number is :" +n*n*n);
 }
}
class absdemo3 extends absdemo
{
 void calculate(int n)
 {
  System.out.println("The square root of the number is :" +Math.sqrt(n));
 }
}
class Abstract
{
 public static void main(String args[])
 {
  absdemo1 ram1=new absdemo1();
  absdemo2 ram2=new absdemo2();
  absdemo3 ram3=new absdemo3();
        ram1.calculate(2);
        ram2.calculate(3);
        ram3.calculate(625);
 }
}
