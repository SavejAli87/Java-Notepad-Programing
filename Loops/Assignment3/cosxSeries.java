// cosx Series

       import java.util.*;
 
    class cosxSeries{
	  
	  public static void main(String args[]){
	   
	    Scanner input = new Scanner(System.in);
		
	     System.out.println("\nEnter the Number ");
		        double x=input.nextDouble();  
				
			 System.out.println("\nEnter the Number ");
		      int n=input.nextInt();  
				
			double cosx = 0.0;
			
			
			for(int i = 1; i <= n; i++ ) {
			  
			double term = Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
			cosx += term;
			
			}
			System.out.println(sinx);
			System.out.println(Math.cos(x));
			
	  }
	  public static double factorial(int num) {
	   
	   double fact = 1.0;
	   for(int i= 2; i <= num ; i++){
	   fact *= i;
	   }
	   return fact;
	}
	}
