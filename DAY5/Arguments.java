class Witharguments
{
 int a,b,c;
 void arg(int x,int y)
 {
  a=x;
  b=y;
  c=a+b;
  System.out.println("the addition is:"+c);
 }
}
class Arguments
{
 public static void main(String args[])
 {
  int m=10,n=20;
  Witharguments ram=new Witharguments();
  ram.arg(m,n);
}
}
