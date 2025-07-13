class Ques17{
 static void triangleBsum(int x[][]){
   int Bsum=0;
   for(int i=0;i<x.length;i++){
   for(int j=0;j<x[0].length;j++){
    if( i <= j){
	 Bsum += x[i][j];
	 }
	 }
	 }
	 System.out.println(Bsum);
	}
	
	public static void main(String[] args){
	
	int x[][] = { 
	              {34,5,6},
				  {6,4,1},
				  {9,4,2}
				  };
				  
				  triangleBsum(x);
			}
	}
	