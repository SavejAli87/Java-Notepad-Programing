class Ques2{
   
    static int spaceCount( String a ){
	 int count = 0;
	 for(int i=0;i<a.length();i++){
		 if( a.charAt(i)== ' '){
			 
			 count++;
		 }
	 }
	  System.out.println(count);
	  return count;
	}
	  public static void main(String args[]){
	  String a = " I am good boy " ;
	    spaceCount(a);
	  }
	}
	 
	 