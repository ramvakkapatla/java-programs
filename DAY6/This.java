class Addition
{
 int a=100;
 void demo()
 {
  int a=200;
  System.out.println("the instance variable is: " +this.a);
  System.out.println("the local variable is: " +a);
 }
}
class This
{
 public static void main(String args[])
 {
  Addition a1=new Addition();
   a1.demo();
 }
}