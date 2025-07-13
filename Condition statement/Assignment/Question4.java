class Ques4
{
public static void main(String[] args)
{
System.out.println(" Enter the sal : ");
int sal=new java.util.Scanner(System.in).nextInt();

System.out.println(" Enter the y : ");
int y=new java.util.Scanner(System.in).nextInt();
  int p=(sal*5)/100;
  int A=sal+p;
 
 if(y>5)
 {
	 
	 System.out.println("total sal : " + A);
 }
 else
 {
	 System.out.println("total sal : "+p);
 }
}
}