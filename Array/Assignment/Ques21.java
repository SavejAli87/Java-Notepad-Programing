class Ques21{

 static void frequencyCoun( int x[] ){
 int n = x.length;
   boolean fre[] = new boolean[n];
    
	for( int i=0;i< n; i++) {
	 if( fre[i] ) continue;
	 
	  int cont = 1;
	  
	  for( int j=i + 1; j < n; j++){
	   if( x[i] == x[j] ) {
	   fre[j] = true;
	    cont ++;
		}
		}
		System.out.println(x[i] + " occurs " + cont + " time(s) " );
   }
 }
  public static void main (String[] args) {
  
   int x[] = { 3,5,2,3,5,4,1,7,4,3,4,2};
  
       frequencyCoun(x);
}
}	   