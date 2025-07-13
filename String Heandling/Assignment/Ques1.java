  
   class Ques1{
   
    static int wordCount( String a ){
	
	 int b= a.trim().split("\\s+" ).length;
	
	
	  System.out.print(b);
	 
	  return 0;
	
	}
    
	  public static void main(String args[]){
	  
	  String a = " I am good boy " ;
	  
	    wordCount(a);
	  
	  
	  }
	}
	 
	 
	 