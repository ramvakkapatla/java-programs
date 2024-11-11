import java.util.Scanner;
class Emp
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int eno;
  String ename;
  double esalary;
  System.out.println("enter employee no:");
  eno=sc.nextInt();
  System.out.println("enter employee name:");
  ename=sc.next();
  System.out.println("enter employee salary:");
  esalary=sc.nextDouble();
	System.out.println("employee no is:"+eno);
	System.out.println("employee name is:"+ename);
	System.out.println("employee salary is:"+esalary);
}
}