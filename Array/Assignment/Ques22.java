class Ques22{
 
  static void firstnonrepeatingelement(int x[]){
   
     int n= x.length;
	 for(int i=0;i < n;i++){
	 
	  boolean isRepeating = false;
	   
	   for(int j=0;j < n ; j++){
	    if( i != j && x[i] == x[j] ){
		 isRepeating = true;
		  break;
		  }
		 }
		 if( !isRepeating) {
		  System.out.println(" First non-repeating element is : " + x[i]   );
		  
		  }
		  } 
		  
		  System.out.println( "  No non-repeating element found. ");
		  
		  }
		  
		   public static void main(String[] args ) {
		   
		     int x[]= { 2,3,4,2,2,6,3,3};
			  firstnonrepeatingelement(x);
			  
			  }
			  }