class Ques3
{
public static void main(String[] args)
{
System.out.println(" Enter the unit : ");
int unit=new java.util.Scanner(System.in).nextInt();
 int p= unit*100;
 
 if(p>1000)
 {
	 int dis=(p*10)/100;
	 int Cost= p-dis;
	 System.out.println("total Cost : " + Cost);
 }
 else
 {
	 System.out.println("total Cost : "+p);
 }
}
}