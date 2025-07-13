class Ques13
{
  static void triangleSum(int[][] matrixA)
  {
    int sum=0;
 
  for(int i=0;i<matrixA.length;i++)
{
 for(int j=0;j<=i;j++)
  {
    sum += matrixA[i][j];
  }
  
 }
  System.out.println(sum); 

}
public static void main(String[] args)
{
 int[][] matrixA= {
                    {1,4,7},
					{2,6,3},
					{8,5,4}
					};

					
	triangleSum(matrixA);
	  
	  
	  }
	  }

   