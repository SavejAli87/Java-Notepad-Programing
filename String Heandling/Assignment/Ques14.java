

class Ques14{
  
  static void changeCase(String a){
   
       String change = "";
	  
	  for(int i= 0; i<a.length();i++){
	    char ch = a.charAt(i) ;
		 if( ch >= 'a' && ch <= 'z'){
		  change += (char)(ch - 32);
		  }
		  else if(ch >= 'A' && ch <= 'Z' ){
		   change += (char)( ch + 32);
		
		 } else {
		  change += ch ;
		 
		 }
		 }
				 
		  System.out.println(a);
		  System.out.println( change);
		   }
		 public static void main(String args[]){
		 String a = " heLLo world";
		  changeCase(a);
		  }
		 }