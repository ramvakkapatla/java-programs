import java.util.Scanner;
class Bubblesorting
{
 public static void main(String Args[])
   {
   Scanner ram=new Scanner(System.in);
   int i;
   int j;
   int n;
   int t;
   System.out.println("enter n value:");
   n=ram.nextInt();
   int a[]=new int[n];
   System.out.println("enter array values:");
   for(i=0;i<n;i++)
     {
      a[i]=ram.nextInt();
     }
     System.out.println("the elements before sorting:");
      for(i=0;i<n;i++)
      {
       System.out.println(a[i]);
      }
       for(i=0;i<n-1;i++)
        {
         for(j=0;j<n-1-i;j++)
         {
           if(a[i]>a[j+1])
          {
            t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
          }
        }
       }
            System.out.println("the elements after sorting is:");
            for(i=0;i<n;i++)
            System.out.println(a[i]);
}
}