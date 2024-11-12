import java.util.Scanner;
class Arraydynamic
{
 public static void main(String Args[])
   {
   Scanner ram=new Scanner(System.in);
   int i;
   int n;
   System.out.println("enter n value:");
   n=ram.nextInt();
   int a[]=new int[n];
   System.out.println("enter array values:");
   for(i=0;i<a.length;i++)
     {
      a[i]=ram.nextInt();
     }
     System.out.println("the elements in the array is:");
      for(i=0;i<a.length;i++)
      {
       System.out.println(a[i]);
      }
    }
}