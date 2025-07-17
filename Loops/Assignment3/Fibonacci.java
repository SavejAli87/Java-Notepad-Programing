
// Fibonacci Series 

    import java.util.*;
 
    class Fibonacci{
	  
	  public static void main(String args[]){
	   
	    Scanner input = new Scanner(System.in);
		
	     System.out.println("\nEnter the Number ");
		        int a=input.nextInt();  
				
			int f=0, s=1;
			
			for(int i = 0; i <= a; i++ ) {
			  
			  int sum = f + s;
			  
			    f=s;
				s= sum;
			   
			   System.out.println(f);
				}
				
			}
			
			}