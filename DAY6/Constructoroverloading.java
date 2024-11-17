class Conover
{
 int a,b,c;
 Conover()
 {
    System.out.println("it is non parameterized");
 }
 Conover(int n)
  { 
   System.out.println("the n value is:"+n);
  }
  Conover(int x,int y)
   {
     a=x;
     b=y;
     c=a+b;
     System.out.println("the addition is:"+c);
   }
 }
class Constructoroverloading
{
 public static void main(String args[])
 {
  int m=10,n=20;
  Conover ram1=new Conover();
  Conover ram2=new Conover(10);
  Conover ram3=new Conover(m,n);
}
}		
