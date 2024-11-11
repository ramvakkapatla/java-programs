import java.util.Scanner;
class Area
{
public static void main(String args[])
{
 Scanner ram=new Scanner(System.in);
 int r;
 float pi=1.34F;
 double area;
 System.out.println("enter radius:");
 r=ram.nextInt();
 area=pi*r*r;
	System.out.println("radius is:"+r);
	System.out.println("area of circle is:"+area);
}
}