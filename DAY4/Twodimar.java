import java.util.Scanner;
class Twodimar
{
 public static void main(String args[])
 {
  Scanner ram=new Scanner(System.in);
  int i,r,c,j;
  System.out.println("enter row value:");
  r=ram.nextInt();
  System.out.println("enter column value:");
  c=ram.nextInt();
  int a[][]=new int[r][c];
  System.out.println("enter elemets to array:");
  for(i=0;i<r;i++)
   {
    for(j=0;j<c;j++)
     {
     a[i][j]=ram.nextInt();
     }
    }
     
    System.out.println("the elemets in array:");
    for(i=0;i<c;i++)
    {
          for(j=0;j<c;j++)
         {
                System.out.println(" "+a[i][j]);
          }
            System.out.println();
 }
}
}