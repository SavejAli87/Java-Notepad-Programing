
// even and odd sum Ques7

  import java.util.*;
 
  class EvenOdd{
  
   public static void main(String args[]){
   
      Scanner input = new Scanner(System.in);
   
     System.out.println("Enter the Number ");
		int n=input.nextInt();
		
		int even = 0;
		int Odd = 0;
		
		for(int i=1; i<=n;i++){
		    int m=input.nextInt();
		if(m %2!= 0){
		    even += m; 
		 System.out.println("this number Odd ");
		 }
		  else{
		     Odd += m;
			System.out.println("this number even ");
			
			} 
			
			}
			
			System.out.println(even);
			System.out.println(Odd);
			
			
			}
			
  }