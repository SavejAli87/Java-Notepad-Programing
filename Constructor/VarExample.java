class VarExample
{
public static void main(String... s)
{
  System.out.println("Enter the no");
  var days= new java.util.Scanner(System.in).nextint();
  System.out.println(days);
  
  System.out.println("Enter the Name");
  var no= new java.util.Scanner(System.in).nextLine();
  System.out.println(no);
  
  byte b1=10;
  byte b2=20;
  var b3= b1+b2;
  System.out.println(b3);
  var s1= new VarExample();
  System.out.println(s1);
  var ch=10;
  
  var z="hello";
  var b=true;
  System.out.println(ch);
  System.out.println(z);
  System.out.println(b);
  var a=10;
  var c=3;
  var d=a/c;
  System.out.println(d);
  }
  }