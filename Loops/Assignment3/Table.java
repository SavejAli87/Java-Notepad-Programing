
  // print Table 
  
  import java.util.*;
  
  class Table{
	   
	   public static void main(String args[]){
	     Scanner input = new Scanner(System.in);
	    
		System.out.println("Enter the Number");
		int n=input.nextInt();
		
		int t = 0;
		
	   for(int i=1; i<=10;i++){
	      if(n > 0){

            t= n * i;			  
		  
		  System.out.println(t);
			 
	   }
	   
	   System.out.println(" ");
	   
	   }
	   }
	   }
	  