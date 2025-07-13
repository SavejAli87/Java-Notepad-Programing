class Ques6{
 static String lTrim(String a){
  
 String b = a.replaceAll("\\s+"," ");
 String result = b;
 
 
   System.out.println(a);
   System.out.println(result);
   
   return result;
 
 
	}
	public static void main(String args[]){
	
	 String a= "     hello java ";
	 lTrim(a);
	 }
	 }