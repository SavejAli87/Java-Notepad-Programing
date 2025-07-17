  
  
  import java.util.*;

    class LargestAndSmallest{
	
	 public static void main (String args[]){
	 
	    Scanner input = new Scanner(System.in);
	      char ch;
	     
		  
		  int largest = Integer.MIN_VALUE;
          int smallest = Integer.MAX_VALUE;
		  
		   do{
			    System.out.println("\nEnter the Number ");
		        int n=input.nextInt();
				
				
			   
		       if(n > largest ) {
			    largest = n;
				}
				 if( n < smallest){
				  smallest = n;
				  } 
				 
				   
				    System.out.println("Enter the Y to continue");
		            ch=input.next().charAt(0);
		 
		 }
		 
		       while (ch == 'y' || ch == 'Y' );
			   
                System.out.println("largest Print : " +largest);
				System.out.println("smallest Print : " +smallest);
				
				
				}
				}