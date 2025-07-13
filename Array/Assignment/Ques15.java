 class Ques15
{
static void triangleMax(int x[][]){
 int max=x[0][0];
 for(int i=0;i<x.length;i++){
 for(int j=0;j<x[0].length-1;j++){
 if(max < x[i][j]){
   max = x[i][j];
   }
   }
 }
   System.out.println(max);
   }
   public static void main(String[] args){
   
   int x[][]={ {4,6,100},{54,75,3}};
   
   triangleMax(x);
   }
   }