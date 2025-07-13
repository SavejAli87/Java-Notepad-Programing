class Ques7{
 static String rTrim(String a){
  
 String b = a.replaceAll("\\s+$"," ");
 String result = b;
 
 
   System.out.println(a);
   System.out.println(result);
   
   return result;
 
 
	}
	public static void main(String args[]){
	
	 String a= "   hello java           ";
	 rTrim(a);
	 }
	 }