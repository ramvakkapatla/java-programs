class Addition
{
 int c;
 void add(int a,int b)
 {
  c=a+b;
  System.out.println("Addition of a+b is :" +c);
 }
 void add(int a,int b,int d)
 {
  c=a+b+d;
  System.out.println("Addition of a+b+d is :" +c);
 }
}
class MethodOverloading
{
 public static void main(String args[])
 {
  Addition a1=new Addition();
      a1.add(10,20);
      a1.add(54,76,78);
 }
}