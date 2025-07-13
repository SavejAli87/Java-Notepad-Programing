class Ques4
{

static int x[][]={{10,23,21,45,2},{10,23,21,49,2}};


  static int lowest()
  {
  int min=x[0][0];
   
  
  for(int i=0;i<x.length; i++)
  {
  for(int j=0;j<x[0].length; j++)
  {
  if( min > x[i][j])
  
  min = x[i][j];
  
  
  
  }
  }
  return min;
  }
   public static void main(String[] args)
   {
   System.out.println(lowest());
   }
   
}
