
import java.awt.*;
import javax.swing.*;

  public class ShutdownHooks implements Runnable{
   
    public void run(){
	 
	  System.out.println("*** Application Shutting down **");
	  ShutdownHooks1 hook =new ShutdownHooks1();
	  Thread t1 = new Thread(hook);
	  t1.start();
	   
	    try{
		    t1.join();
			}catch(Exception e){ }
			System.out.println("*** After backup ***");
			}
		}
	
	class ShutdownHooks1 implements Runnable{
   
    public void run(){
	 
	  System.out.println("*** Tsking backup and closing resource **");
	 
	   
	    try{
		    Thread.sleep(1000*5);
			}catch(Exception e){ }
			System.out.println("*** After backup ***");
			}
		}
		
		class RunHookup {
		 public static void main(String args[]){
		  
		  Runtime runtime = Runtime.getRuntime();
		  
		ShutdownHooks hook = new ShutdownHooks();
		 
		  runtime.addShutdownHook(new Thread(hook));
		  System.exit(0);
		  int x=10/0;
		   JFrame testFrame = new JFrame(" Test Frame");
		   
		  testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  testFrame.setSize(400, 400);
		   testFrame.setVisible(true);
		   System.out.println("Hello");
		   }
		   }