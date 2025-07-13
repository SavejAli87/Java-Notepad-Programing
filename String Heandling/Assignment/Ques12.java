 class Ques12{
   
    static int sequenceCount( String a , String b){
	
	 
	
	  int count = 0;
	  //int i= 0;
	   for (int i = 0; (i = a.indexOf(b, i)) != -1; i++){
		   count++;
		   //i++;
	   }
	   System.out.println(a);
	  System.out.print(b + " " + count);
	 
	  return count;
	
	}
    
	  public static void main(String args[]){
	  
	  String a = " I am good boy ooono oo o" ;
	  String c = "o";
	  
	    sequenceCount(a,c);
	  
	  
	  }
	}
	 