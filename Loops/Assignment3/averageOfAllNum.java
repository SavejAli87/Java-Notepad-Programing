
// average of all num
   import java.util.*;
   
   class averageOfAllNum{
   
     public static void main(String args[]){
	   
	     Scanner input = new Scanner(System.in);
	      System.out.println("\nEnter the Number a");
		     int a=input.nextInt();  
			
			 int aver = 0;
			 
			 for(int i=1;i<=a; i++){
			  
			     aver += i;
			  }

				 System.out.println(aver/a);
				 
				}
				}