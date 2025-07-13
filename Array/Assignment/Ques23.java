class Ques23{
  static void bineryToDecimal( int x[]){
   int n=x.length;
    int decimal = 0;
	 for(int i = 0; i< n; i++){
	  decimal = decimal * 2 + x[i];
	  }
	  
	   System.out.println("decimal: " + decimal);
	   }
	   public static void main(String[] args)
	    {
		 int x[] = { 1,0,1,0,1};
		  bineryToDecimal(x);
		  }
		  }