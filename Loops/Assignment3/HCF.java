 
  // HCF  Ques 9
  
  import java.util.*;
  
    class HCF{
	
	 public static void main ( String args[]){
	 
	    Scanner input = new Scanner(System.in);
	     System.out.println("Enter the Number n");
		 int n=input.nextInt();
		 
		  System.out.println("Enter the Number m");
		  int m=input.nextInt();
	    
		int HCF = 1;
		
		 for(int i=1; i <= n && i <= m ; i++){
		  if( n % i == 0 && m % i == 0 ){
		  HCF = i;
		  
		  }
		  } 
		  
		  System.out.println(HCF);
		 
		  
		  }
		  }