class Ques2
{

static int x[]={10,23,21,45,2};

  static int lowest()
  {
  int min=x[0];
  
  for(int i=0;i<x.length; i++)
  if(x[i] < min)
  min = x[i];
  return min;
  }
   
   public static void main(String[] args)
   {
   System.out.println(lowest());
   }
   }