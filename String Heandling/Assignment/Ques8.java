class Ques8{
 static String AllTrim(String a){
  
 String b = a.replaceAll("^\\s+","");
  String c = b.replaceAll("\\s+$","");
   String d = c.replaceAll("\\s+"," ");
  
 String result = d;
 
 
   System.out.println(a);
   System.out.println(result +",");
   
   return result;
 
 
	}
	public static void main(String args[]){
	
	 String a= "       hello java        tt        ";
	 AllTrim(a);
	 }
	 }