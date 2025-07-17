// Simple Intrest Ques 29

  import java.util.*;

 class simpleIntrest{
  
   public static void main(String args[]){
    
	  Scanner input = new Scanner(System.in);
	  System.out.println("\nEnter the Number Princple");
		int p=input.nextInt();  
		
	  System.out.println("\nEnter the Number Rate");
		int r=input.nextInt();  
		
	  System.out.println("\nEnter the Number Time");
		int t=input.nextInt(); 

       int SP = (p*r*t)/100;
     
       System.out.println("Simple Intrest: " +SP);
          }
       }		  