class Ques5
{
public static void main(String[] args)
{
System.out.print(" Enter the Hindi : ");
int H=new java.util.Scanner(System.in).nextInt();

System.out.print(" Enter the English : ");
int E=new java.util.Scanner(System.in).nextInt();

System.out.print(" Enter the Maths : ");
int M=new java.util.Scanner(System.in).nextInt();

System.out.print(" Enter the SST : ");
int S=new java.util.Scanner(System.in).nextInt();

System.out.print(" Enter the Art : ");
int A=new java.util.Scanner(System.in).nextInt();

  int p=(A+H+E+M+S);
  
  int T=p/5;
  
  System.out.println("Total Number : " +p);
  System.out.println("Total per : " +T+"%");
  
 
 if(T>80)
 {
	 
	 System.out.println(" Grad : A  ");
 }
 else if(T>60)
 {
	  System.out.println(" Grad : B ");
 }
 else if(T>50)
 {
	  System.out.println(" Grad : C ");
 }
 else if(T>45)
 {
	  System.out.println(" Grad : D ");
 }
 else if(T>25)
 {
	  System.out.println(" Grad : E ");
 }
 else if(T<25)
 {
	  System.out.println(" Grad : F ");
 }
}
}