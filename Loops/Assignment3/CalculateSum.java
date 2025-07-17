
// CalculateSum Series 

    import java.util.*;
 
    class CalculateSum{
	  
	  public static void main(String args[]){
	   
	    Scanner input = new Scanner(System.in);
		
	     System.out.println("\nEnter the Number ");
		        int a=input.nextInt();  
				
			double sum = 0.0;
			
			for(int i = 1; i <= a; i++ ) {
			  
			  sum += 1.0/i;
			  
            
				}
			  System.out.println(sum);
			}
			
			}