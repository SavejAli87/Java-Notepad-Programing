class test{
 static void frequencyCont( int x[]) {
 
    int n = x.length;
	 boolean fre[] = new boolean[n];
	 
	   for( int i = 0 ; i < n; i++){
	    if( fre [i] ) continue;
		
		int cont = 1;
		
		 for(int j=0; j < n; j++) {
		  if( x[i] == x[j] ) {
		   fre[j] = true;
		     cont ++;
			 }
			 }
			System.out.println(x[i] + " occrus " + cont + " time(s) " );
  }
 }
   public static void main( String[] args ){
  
    int x[] = { 3, 23,3,2,3,2,1,5,5,6,3,3};
     frequencyCont(x);
    }
 }	