class Buffer
{ 
 public static void main(String args[])
 {
  StringBuffer sb1=new StringBuffer();
  StringBuffer sb2=new StringBuffer("ramananeyulu");
  System.out.println("the default capacity of the String buffer class is"+sb1.capacity());
  System.out.println("the length of the given string is:"+sb2.length());
 }
}