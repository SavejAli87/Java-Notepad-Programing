import java.util.Arrays;

class Ques16{
  
  static void sortedOrder(String a){
   
      int[] sort = new int[256];
	   String sorted = "";
	   
	   for(int i= 0; i<a.length();i++){
	    char ch = a.charAt(i) ;
		 
		  if( ch >= 'a' && ch <= 'z'){
		  
		  sort[ ch - 'a']++;
		  }
		
		 }
		 
		 for(int i=0; i < 256; i++){
			 while( sort[i] > 0 ) {
				 sorted += (char) (i + 'a' );
				 sort[i]--;
			 }
		 }
				 
		  System.out.println(a);
		  System.out.println( sorted );
		  
		 }
		 public static void main(String args[]){
		 
		 String a = " hello world";
		  sortedOrder(a);
		  sortedArray1(a);
		  }
		 }
		 
		 
		 class sortedArray{
			 static void sortedArray1(String a){
				 
				 char[] ch = a.toCharArray();
				 
				 Arrays.sort(ch);
				 
				 String sorted = new String(ch);
				 
				 System.out.println(sorted);
			 }
			 
		 }