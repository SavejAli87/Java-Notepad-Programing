class Ques6
{
public static void main(String[] args)
{
System.out.print("Enter the Age A : ");
int A=new java.util.Scanner(System.in).nextInt();

System.out.print("Enter the Age B : ");
int B=new java.util.Scanner(System.in).nextInt();

System.out.print("Enter the Age C : ");
int C=new java.util.Scanner(System.in).nextInt();

if(A>55 || B>55 || C>55 )
{
System.out.println( " Oldest  ");
}
else if(A>15 || B>15 || C>15 )
{
System.out.println( " Youngest ");
}
else if(A<15 || B<15 || C<15 )
{
System.out.println( " Child ");
}

}
}
