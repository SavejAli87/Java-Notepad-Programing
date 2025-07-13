 
 import java.awt.*;
  
   class Cals{
    
	 Frame f;
	  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,sum,sub,mul,div,equl;
	  Label l;
	  TextField tf;
	   Cals (String s){
	    
		 f=new Frame(s);
		 l=new Label("Enter the no.");
		 l.setBounds(20,10,100,60);
		 f.add(l);
		 
		 tf=new TextField();
         tf.setBounds(20,70,340,40);
         f.add(tf);

		 b1=new Button("9");
		 b1.setBounds(20,120,85,85);
		 f.add(b1);
		 
		 b2=new Button("8");
		 b2.setBounds(110,120,85,85);
		 f.add(b2);
		 
		 b3=new Button("7");
		 b3.setBounds(200,120,85,85);
		 f.add(b3);
		 
		 b4=new Button("*");
		 b4.setBounds(290,120,85,85);
		 f.add(b4);
		 
		 b5=new Button("4");
		 b5.setBounds(20,210,85,85);
		 f.add(b5);
		 
		 b5=new Button("5");
		 b5.setBounds(110,210,85,85);
		 f.add(b5);
		 
		 b5=new Button("6");
		 b5.setBounds(200,210,85,85);
		 f.add(b5);
		 
		 b5=new Button("-");
		 b5.setBounds(290,210,85,85);
		 f.add(b5);
		  
		 b5=new Button("1");
		 b5.setBounds(20,300,85,85);
		 f.add(b5);
		 
		 b5=new Button("2");
		 b5.setBounds(110,300,85,85);
		 f.add(b5);
		 
		 b5=new Button("3");
		 b5.setBounds(200,300,85,85);
		 f.add(b5);
		 
		 b5=new Button("+");
		 b5.setBounds(290,300,85,85);
		 f.add(b5);
		 
		  b5=new Button("%");
		 b5.setBounds(20,390,85,85);
		 f.add(b5);
		 
		 b5=new Button("0");
		 b5.setBounds(110,390,85,85);
		 f.add(b5);
		 
		 b5=new Button(".");
		 b5.setBounds(200,390,85,85);
		 f.add(b5);
		 
		 b5=new Button("=");
		 b5.setBounds(290,390,85,85);
		 f.add(b5);
		 
		 
		 Toolkit t=f.getToolkit();
     Dimension screenSize = t.getScreenSize();
     int width = screenSize.width * 8 / 10;
     int height = screenSize.height * 8 / 10;
     //f.setBounds(width/8, height/8, width, height);
     f.setBounds(200, 100,400, 600);
     f.setLayout(null);
     f.setVisible(true);
	
	}
	
	public static void main(String args[]){
	 
	 new Cals("calc");
	 }
	}
