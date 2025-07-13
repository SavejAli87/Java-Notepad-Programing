class Ques14{

static void matrixSum(int x[][]){
 int sum=0;
 for(int i=0;i<x.length;i++){
 for(int j=0;j<x[i].length;j++){
   sum += x[i][j];
   }
   } 
   
  System.out.println(sum);
  
  }
  public static void main(String[] agrs)
  {
  int x[][]= {
              {4,6,7},
			  {5,7,3},
			  {9,1,5}
			  };
		matrixSum(x);
		}
		}
		
	