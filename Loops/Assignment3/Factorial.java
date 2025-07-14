 // factorial 
 
 import java.util.*;
  
  class Factorial{
	   
	   public static void main(String args[]){
	     Scanner input = new Scanner(System.in);
	    
		System.out.println("Enter the Number");
		int n=input.nextInt();
		
		int Fact = 1;
		
	   for(int i=1; i<=n;i++){
	      Fact *= i;			  
		  
		  System.out.println(Fact);
			 
	   }
	   
	   System.out.println(" ");
	   
	   }
	   }
	   
	  