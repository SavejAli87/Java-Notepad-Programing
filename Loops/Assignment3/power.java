// two number power print

import java.util.*;
  
  class power{
	   
	   public static void main(String args[]){
	     Scanner input = new Scanner(System.in);
	    
		System.out.println("Enter the Number ");
		int n=input.nextInt();
		
		System.out.println("Enter the Number");
		int m=input.nextInt();
	
		int power = 1;
		
	   for(int i=1; i<=m;i++){
	     	
         	power *= n;	
		  
		  System.out.println(power);
			 
	   }
	   
	   System.out.println(" ");
	   
	   }
	   }
  
	  