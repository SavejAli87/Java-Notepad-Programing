
// division 3 or 4
   import java.util.*;
   class div4or3{
   
     public static void main(String args[]){
	   
	     Scanner input = new Scanner(System.in);
	      System.out.println("\nEnter the Number a");
		     int a=input.nextInt();  
			 
			  System.out.println("\nEnter the Number b");
		     int b=input.nextInt();  
			 
			 int sum = 0;
			 
			 for(int i=a;i<=b; i++){
			  
			   if(i%4==0 || i%3==0){
			   
			     sum += i;
				
				 }
				
				}
				 System.out.println(sum);
				}
				}