class Ques13{
  
  static void frequencyCount(String a){
   
      int[] freq = new int[256];
	 
	   
	   for(int i= 0; i<a.length();i++){
	    char ch = a.charAt(i) ;
		 
		  if( ch >= 'a' && ch <= 'z'){
		  
		  freq[ ch - 'a']++;
		  }
		
		 }
		 
		 for(int i=0; i < 256; i++){
			 if( freq[i] > 0 ) {
				 
		  System.out.println(a);
		  System.out.println( (char)(i + 'a') + ":" + freq[i]);
		  
			 }
		 }
		 }
		 public static void main(String args[]){
		 
		 String a = " hello world";
		  frequencyCount(a);
		  }
		 }