 // aske to user  
  
  import java.util.*;
  class askeToUser {
   
    public static void main(String args[]){
	 
	    Scanner input = new Scanner(System.in);
		char ch ;
		 
		do{
	     System.out.println("Enter the Number ");
		 int n=input.nextInt();
		 
		 System.out.println("Enter the Number ");
		 int m=input.nextInt();
		 
		 int sum = n + m;
		 System.out.println("sum : " +sum);
		 
		  System.out.println("Enter the Y to continue");
		   ch=input.next().charAt(0);
		 
		 }
		 
		 while (ch == 'y' || ch == 'Y' ); {
		 
		    System.out.println("Trmineat programe ");
			
			}
		}
	}
		  
		  