
  
// Nearest Fibonacci Number 

    import java.util.*;
 
    class nearestFiboacciNum{
	  
	  public static void main(String args[]){
	   
	    Scanner input = new Scanner(System.in);
		
	     System.out.println("\nEnter the Number ");
		        int a=input.nextInt();  
				
			int f=1, s=1;
			int result = f+s;
			
			while(result < a)  {
			  result = f+s;
			    f=s;
				s= result;
			   
				}
				int nearest = (a-f) <= ( result - a ) ? s : result;
				System.out.println("Nearest Fibonacci number to " + a + " is " + nearest);
			}
			
			}
