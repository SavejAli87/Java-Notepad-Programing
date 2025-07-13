class Ques3{
    static int charCount( String a ){
	 int count = 0;
	 for(int i=0;i<a.length();i++){
		 if( a.charAt(i) != ' '){ 
			 count++;
		 }
	 }
	  System.out.print(count);
	  return 0;
	}
     public static void main(String args[]){
	  
	  String a = "I am good boy" ;
	  
	    charCount(a);
	  }
	}
	 
	 