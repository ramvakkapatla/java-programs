import java.util.Scanner;
class Marks
{
 public static void main(String args[])
 {
  Scanner ram=new Scanner(System.in);
  int sno,m,p,c,total;
  String sname;
  float average;
  System.out.println("enter student no:");
  sno=ram.nextInt();
  System.out.println("enter student name:");
  sname=ram.next();
  System.out.println("enter maths marks:");
  m=ram.nextInt();
  System.out.println("enter physics marks:");
  p=ram.nextInt();
  System.out.println("enter chemistry marks:");
  c=ram.nextInt();
  total=m+p+c;
  average=total/3;
  	System.out.println("student no is:"+sno);
  	System.out.println("student name is:"+sname);
  	System.out.println("maths marks:"+m);
  	System.out.println("physics marks:"+p);
        System.out.println("chemistry marks:"+c);
  	System.out.println("student average is:"+average);
 }
}