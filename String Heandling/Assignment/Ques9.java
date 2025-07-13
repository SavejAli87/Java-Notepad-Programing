class Ques9{
 static String squeeze(String a){
  
 String b = a.replaceAll(" ","");
 String result = b;
 
 
   System.out.println(a);
   System.out.println(result);
   
   return result;
 
 
	}
	public static void main(String args[]){
	
	 String a= "   hello java        tt   ";
	 squeeze(a);
	 }
	 }