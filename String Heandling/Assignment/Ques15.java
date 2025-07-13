  class Ques15 {
   

    static String singleOccurence( String a ) {
	
	    String single =""+a.charAt(0);
	     
	    for( int i = 1; i< a.length(); i++){
		 //char ch = a.charAt(i);
		 if( a.charAt(i) != a.charAt(i-1)) {
		 single += a.charAt(i);
		 
		 }
		 }
		 System.out.println(a);
		 
		 System.out.println(single);
		 return single;
		 }
		 
		 public static void main(String args[]){
		  
		   String a = "hellllooo wwworld ";
		    singleOccurence(a);
			
			}
			}
		 
		 
		 
		 
