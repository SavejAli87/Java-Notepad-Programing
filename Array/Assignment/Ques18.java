class Ques18{
  static void triangleBmax(int x[][] )
   {
    int max = x[0][0];
	for(int i=0;i<x.length;i++){
	 for(int j=0;j<x[i].length;j++){
	 if( i <= j ) {
	 if( max < x[i][j] ) {
	  max = x[i][j];
	  
	  }
	  
	 }
	 }
	}
	 System.out.println(max);
	 }
	 
 public static void main(String[] args){
  
   int x[][] = { 
                 {34,53,41},
				 {67,2,43},
				 {23,90,33}
				 };
			triangleBmax(x);
			}
			}