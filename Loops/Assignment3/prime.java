
   // prime number 
   
   import java.util.*;
   
     class prime {
	  
	  public static void main(String args[]){
	      Scanner input = new Scanner(System.in);
	     System.out.println("Enter the Number ");
		 int n=input.nextInt();
		 
		 boolean isPrime = true;
		
		  for(int i=2;i<=n/2;i++){
		  
		  if(n % i == 0){
			  
			  isPrime = false;
			  break;
			  
		  }
		  }
		  
		  if(isPrime){
		   
		    System.out.println("This number is prime number " );
			
			} else {
			System.out.println("This number is not prime number " );
			}
			}
			}
			