class Ques5{
    static boolean palindrome( String a ){
	 
	 int left = 0;
	 int right= a.length() -1;
	 
	 while(left < right) {
	 if( a.charAt(left) != a.charAt(right)){
	 return false;
	 
	 }
	  
	  left++;
	  right--;
	  }
	  return true;
	  
	}
     public static void main(String args[]){ 
	  
	  String a = "level" ;
	 // String b= " good ";
	  
	    palindrome(a);
	  }
	}
	 