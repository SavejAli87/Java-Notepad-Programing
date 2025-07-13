class Ques3
{

static int x[][]={{10,23,21,45,2},{10,23,21,49,2}};


  static int largest()
  {
  int max=x[0][0];
   
  
  for(int i=0;i<x.length; i++)
  {
  for(int j=0;j<x[0].length; j++)
  {
  if( max < x[i][j])
  
  max = x[i][j];
  
  
  
  }
  }
  return max;
  }
   public static void main(String[] args)
   {
   System.out.println(largest());
   }
   
}
