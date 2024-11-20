class Addition
{
 int c;
 void add(int a,int b)
 {
  c=a+b;
  System.out.println("Addition1 is :"  +c);
 }
}
class Addition1 extends Addition
{
 void add(int a,int b)
 {
  super.add(3,4);
  c=a+b;
  System.out.println("Addition2 is :"  +c);
 }
}
class Super2
{
 public static void main(String args[])
 {
  Addition1 ram=new Addition1();
      ram.add(10,20);
 }
}