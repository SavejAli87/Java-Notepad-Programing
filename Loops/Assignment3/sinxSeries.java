  
  // sine Series

       import java.util.*;
 
    class sinxSeries{
	  
	  public static void main(String args[]){
	   
	    Scanner input = new Scanner(System.in);
		
	     System.out.println("\nEnter the Number ");
		        double x=input.nextDouble();  
				
			 System.out.println("\nEnter the Number ");
		      int n=input.nextInt();  
				
			double sinx = 0.0;
			
			
			for(int i = 1; i <= n; i++ ) {
			  
			double term = Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
			sinx += term;
			
			}
			System.out.println(sinx);
			System.out.println(Math.sin(x));
			
	  }
	  public static double factorial(int num) {
	   
	   double fact = 1.0;
	   for(int i= 2; i <= num ; i++){
	   fact *= i;
	   }
	   return fact;
	}
	}
