class Ques19{
 static void triangleBmin(int x[][])
 {
  int min= x[0][0];
   for(int i=0;i<x.length;i++){
    for(int j=0;j<x[i].length;j++){
	 if( i >= j){
    if( min >= x[i][j] ) {
     min = x[i][j];
     }
} 
  }
 }
   System.out.println(min);
}
  public static void main(String[] args){

    int x[][] = {
                   { 23,54,23},
                   { 21,22,44},
                   { 57,34,2}
                  };
  triangleBmin(x);
} 
}  