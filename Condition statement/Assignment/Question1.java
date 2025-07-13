class Square
{
public static void main(String[] args)
{
System.out.print("Enter the Line AB : ");
int AB=new java.util.Scanner(System.in).nextInt();

System.out.print("Enter the Line BC : ");
int BC=new java.util.Scanner(System.in).nextInt();

System.out.print("Enter the Line CD : ");
int CD=new java.util.Scanner(System.in).nextInt();

System.out.print("Enter the Line DA : ");
int DA=new java.util.Scanner(System.in).nextInt();

if(AB==CD || DA==BC)
{
System.out.println("this is Square ");
}else
{
System.out.println("this is not Square");
}
}
}