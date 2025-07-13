 class Ques16{
  static void triangleMin(int x[][]){
  
    int min= x[0][0];
	for(int i=0;i<x.length;i++){
	for(int j=0;j<x[0].length-1;j++){
	  if(min > x[i][j]){
	  min = x[i][j];
	  }
	  }
	  }
	  System.out.println(min);
	  }
	public static void main(String[] args){
	
	int x[][]= {
	            {3,6,1},
				{2,5,9}
				};
			triangleMin(x);
			}
			}