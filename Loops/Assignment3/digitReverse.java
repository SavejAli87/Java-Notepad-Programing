// digit Reverse

import java.util.*;
  
  class digitsReverse{
	   
	   public static void main(String args[]){
	     Scanner input = new Scanner(System.in);
	    
		System.out.println("Enter the Number ");
		int n=input.nextInt();
		
		//System.out.println("Enter the Number");
	//	int m=input.nextInt();
	
		int reverse = 0;
		
	   while(n != 0){
		   
		   int digit = n % 10;
	     	
        	reverse = reverse * 10 + digit;	
			
			n=n/10;
		  
		  System.out.println(reverse);
			 
	   }
	   
	   System.out.println(" ");
	   
	   }
	   }
  
	  