class Ques8
{
public static void main(String[] args)
{
System.out.print("Enter the number of Student Hold : ");
int Hold=new java.util.Scanner(System.in).nextInt();

System.out.print("Enter the number of Student at : ");
int at=new java.util.Scanner(System.in).nextInt();

 System.out.println(" Student allowed in the class " +at+ " days " );
 int p=(at*100)/Hold;
 System.out.println(" Student allowed in the class " +p+ "% " );

if(p>75)
{
System.out.println( " Student allowed ");
}else
{
System.out.println( " Student not allowed");
}

}
}
