import java.util.Scanner;
class Linear
{
 public static void main(String Args[])
   {
   int a[]={1,23,43,56,76};
   int i;
   int ser=80;
   for(i=0;i<a.length;i++)
   {
    if(ser==a[i])
    {
     System.out.println(ser+"is found");
     break;
    }
    if(ser!=80)
    System.out.println(ser+"not found");
  }
 }
}