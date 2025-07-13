class Ques24{
 static void maxinonerow( int x[][] ){
  int n= x.length;
   int maxRow = 0;
    for( int i=0; i<n ; i++){
	 
	  for(int j=0; j< n; j++){
	   if( maxRow >= x[i]){
	    maxRow = x[maxRow][j];
		}
		}
		}
		System.out.println(" maxRow : " + maxRow);
		}
		public static void main(String[] args){
		 int x[][]= { {2,4,3},{5,2,4}};
		  maxinonerow(x);
		  }
		  }