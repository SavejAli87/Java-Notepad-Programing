class CheckAlphabet
{
public static void main(String s[])throws java.io.IOException
{
  System.out.print("Enter the Character : ");
  int x=System.in.read();
  
  char ch=(char)x;
  if(ch=='M' || ch=='m')
  System.out.println("Male");
  else
  System.out.println("FeMale");
  System.out.println(x);
  System.out.println(ch);
  }
  }