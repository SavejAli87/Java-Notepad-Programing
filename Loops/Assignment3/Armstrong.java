

  // Armstrong number 
  
   import java.util.*;
  
   class Armstrong {
     
	  public static void main(String args[]){
		  
		  Scanner input = new Scanner(System.in);
	    
		 System.out.println("\nEnter the Number ");
		        int a=input.nextInt();
				
	 int n ,b,sum=0;
	 
	// System.out.println("print Armstrong number 1 to 500 ");
	 
	 for(int i = 1; i <= a; i++){
	  
	   n=i;
	   
	   while( n > 0 ) {
	    
		 b = n % 10;
		 sum = sum + (b*b*b);
		 n = n/10;
		 
		 }
		 
		 if(sum == i) 
		 {
		  System.out.print(i+ " ");
		 }
		 sum = 0;
		 }
		 }
		}
	   
	   
		   
		   