class Ques1
{

static int x[]={10,23,21,45,2};

  static int largest()
  {
  int max=x[0];
  
  for(int i=0;i<x.length; i++)
  if(x[i] > max)
  max = x[i];
  return max;
  }
   
   public static void main(String[] args)
   {
   System.out.println(largest());
   }
   }
   