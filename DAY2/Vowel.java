import java.util.Scanner;
class Vowels
{
 public static void main(String args[])
 {
  Scanner ram=new Scanner(System.in);
  char a;
  System.out.println("enter alphabet:");
  a=ram.next().charAt(0);
  System.out.println("alphabet="+a);
  if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
  {
   System.out.println("alphabet is VOWEL");
  }
  else
  {
   System.out.println("alphabet is CONSONANT");
  }
 }
}