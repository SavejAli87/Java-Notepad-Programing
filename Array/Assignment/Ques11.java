class Ques11
{
  static int[][] multMatrix(int[][] matrixA, int[][] matrixB)
  {
  int numRows = matrixA.length;
  int numCols = matrixA[0].length;
  int[][] result = new int[numRows][numCols];
 
  for(int i=0;i<numRows;i++)
{
  for(int j=0;j<numCols;j++)
  {
   result[i][j] = matrixA[i][j] * matrixB[j][i];
   int Add[i][j] = matrixA[i][j] * matrixB[j][i];
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
					
	int[][] multiMatrix = multMatrix(matrixA,matrixB);				

    for(int i=0;i<multiMatrix.length;i++)
	{
	for(int j=0;j<multiMatrix[0].length;j++)
	{
	  System.out.println(multiMatrix[i][j] + " ");
	  }
	  
	  System.out.println();
	  
	  }
	  }
	  }