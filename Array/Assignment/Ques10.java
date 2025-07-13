class Ques10
{
  static int[][] addMatrix(int[][] matrixA, int[][] matrixB)
  {
  int numRows = matrixA.length;
  int numCols = matrixA[0].length;
  int[][] result = new int[numRows][numCols];
 
  for(int i=0;i<numRows;i++)
{
  for(int j=0;j<numCols;j++)
  {
   result[i][j] = matrixA[i][j] + matrixB[i][j];
  }
 }
   return result;

}
public static void main(String[] args)
{
 int[][] matrixA= {
                    {1,4,7},
					{2,6,3},
					{8,5,4}
					};
 int[][] matrixB = {
                    {9,4,7},
					{2,6,4},
					{8,4,2}
					}; 
					
	int[][] sumMatrix = addMatrix(matrixA,matrixB);				

    for(int i=0;i<sumMatrix.length;i++)
	{
	for(int j=0;j<sumMatrix[0].length;j++)
	{
	  System.out.println(sumMatrix[i][j] + " ");
	  }
	  
	  System.out.println();
	  
	  }
	  }
	  }

   