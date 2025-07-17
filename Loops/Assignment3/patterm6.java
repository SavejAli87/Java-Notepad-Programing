// print patterm Ques18
  
   import java.util.*;
  
    class patterm6{
	 
	  public static void main(String args[]){
	   
	    Scanner input = new Scanner(System.in);
	      System.out.println("\nEnter the Number P");
		        int p=input.nextInt();  
				
				for(int i=1;i<=p;i++){
				 for(int j=1;j<=p-i;j++){
					 System.out.print("  ");
				 }
				 for(int k=i;k>=1;k--){
				 System.out.print(k);
				 }
				 for(int l=2;l<=i;l++){
					 System.out.print(l);
				 }
				 System.out.println();
				 }
				 }
	  }
	