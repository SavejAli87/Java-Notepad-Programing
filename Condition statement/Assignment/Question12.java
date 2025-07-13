class Ques12
{
public static void main(String[] args)
{
System.out.print("Enter the year : ");
int year=new java.util.Scanner(System.in).nextInt();
 
 int y=year%4;


if(y==0)
{
System.out.println( " leap year ");
}else
{
System.out.println( " not leap year");
}

}
}
