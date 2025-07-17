
 
// average of all even num

   import java.util.*;
   
   class averageOfAllEvenNum{
   
     public static void main(String args[]){
	   
	     Scanner input = new Scanner(System.in);
	      System.out.println("\nEnter the Number a");
		     int a=input.nextInt();  
			
			 int aver = 0,count=0;
			 
			 for(int i=1;i<=a; i++){
			  
			  if(i%2!=0){
			         aver += i;
					 count++;
				 
				}
				}
				System.out.println(aver/count);
				}
   }