
 class myThread extends Thread {
  
   public myThread(){
    
	}
	public void run(){
	 
	  for(int i=1; i <= 10; i++){
	  System.out.println("Counting: " +i);
	 
	 try{
	        Thread.sleep(1000);
			}catch(Exception e){ }
		}
	}
}
  public class YieldEx
  {
   public static void main(String[] args){
    myThread ct = new myThread();
	ct.start();
	try{
	    Thread.sleep(1000);
		}catch(Exception e) { }
		Thread.yield();
		System.out.println("main ");
		}
	}