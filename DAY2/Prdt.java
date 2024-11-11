import java.util.Scanner;
class Prdt
{
public static void main(String args[])
{
 Scanner ram=new Scanner(System.in);
 int pno;
 String pname;
 float pcost;
 float pqnt;
 float bill;
 System.out.println("enter product no:");
 pno=ram.nextInt();
 System.out.println("enter product name:");
 pname=ram.next();
 System.out.println("enter product cost:");
 pcost=ram.nextFloat();
 System.out.println("enter product quantity:");
 pqnt=ram.nextFloat();
 bill=pcost*pqnt;
	System.out.println("product no is:"+pno);
	System.out.println("product name is:"+pname);
	System.out.println("product cost is:"+pcost);
	System.out.println("product quantity is:"+pqnt);
	System.out.println("product bill is:"+bill);
}
}