 // print patterm
  
   import java.util.*;
  
    class patterm3{
	 
	  public static void main(String args[]){
	   
	    Scanner input = new Scanner(System.in);
	      System.out.println("\nEnter the Number P");
		        int p=input.nextInt();  
				
				for(int i=1;i<=p;i++){
				 for(int j=i;j<=p;j++){
					 System.out.print(" ");
				 }
				 for(int k=1;k<=i;k++){
				 System.out.print("*");
				 }
				 System.out.println(" ");
				 }
				 }
				 }