 
 class Ques10{
  static int vowelCount(String a){
   
  int count = 0;
  
   for(int i=0;i<a.length();i++){
	   char ch = a.charAt(i);
     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
	  count++;
	 }
	 }
	 System.out.println(a);
	 System.out.println(count);
	 return count;
	 }
	 
	 public static void main(String args[]){
	 
	 String a= "savej ali";
	  vowelCount(a);
	  }
	  }