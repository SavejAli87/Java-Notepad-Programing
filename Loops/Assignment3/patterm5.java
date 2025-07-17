// print patterm
  
   import java.util.*;
  
    class patterm5{
	 
	  public static void main(String args[]){
	   
	    Scanner input = new Scanner(System.in);
	      System.out.println("\nEnter the Number P");
		        int p=input.nextInt();  
				
				for(int i=1;i<=p;i++){
				 for(int j=1;j<=p-i;j++){
					 System.out.print("  ");
				 }
				 for(int k=1;k<=(2*i-1);k++){
				 System.out.print(i);
				 }
				 System.out.println();
				 }
				 }
				 }