 // Ques 11 count number positive negative and zero 
 
 import java.util.*;

    class countNumber{
	
	 public static void main (String args[]){
	 
	    Scanner input = new Scanner(System.in);
	      char ch;
	     
		  
		  int negative=0, Positive=0, zero=0; 
		  
		   do{
			    System.out.println("\nEnter the Number ");
		        int n=input.nextInt();
			   
		       if(n < 0 ) {
			    negative++;
				}
				 else if( n > 0){
				  Positive++;
				  } 
				  else  {
				   zero++;
				   }
				   
				    System.out.println("Enter the Y to continue");
		            ch=input.next().charAt(0);
		 
		 }
		 
		       while (ch == 'y' || ch == 'Y' );
			   
                System.out.println("Positive count : " +Positive);
				System.out.println("negative count : " +negative);
				System.out.println("zero count : " +zero);
				
				}
				}
			   
			   