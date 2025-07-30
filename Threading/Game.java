

import java.awt.*;
import java.awt.event.*;
//import java.awt.Graphics;
import javax.swing.*;

public class Game extends JPanel implements ActionListener{
	
	int y3, x4, y4, z1, z2, r1,r2, r3;
	int x1=20, x2=60, y1=30, y2=200, x3, w;
	Color c1, c2;
	JPanel p1, p2;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	
	public void savej(){
		c1= new Color(r1, r2, r3);
		setLayout(null);
		
		p1=new JPanel(); 
		p2 = new JPanel();
		b1=new JButton("START");
		
		b2=new JButton("STOP");
		b3 = new JButton("RED");
		b3.setBackground(Color.RED);
		b4=new JButton("GREEN");
		b4.setBackground(Color.GREEN);
		b5=new JButton("BLUE");
		b5.setBackground(Color.BLUE);
		
		//b4.setBounds(200, 350, 40, 30);
		//b5.setBounds(250, 350, 40,30);
		p1.setBounds(200, 450, 900,70);
		p2.setBounds(200, 530, 900,70);
		
		p1.add(b1);
		p1.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6 = new JButton("PINK");
		b6.setBackground(Color.PINK);
		
		p2.add(b6);
		b6.addActionListener(this);
		b7= new JButton("ORANGE");
		b7.setBackground(Color.ORANGE);
		
		p2.add(b7);
		b7.addActionListener(this);
		b8= new JButton("YELLOW");
		b8.setBackground(Color.YELLOW);
		
    //  b8 = new JButton("YELLOW");
      p2.add(b8);
      b8.addActionListener(this);

      b9 = new JButton("MAGENTA");
	  b9.setBackground(Color.MAGENTA);
      p2.add(b9);
      b9.addActionListener(this);

      b10 = new JButton("BLACK");
	  b10.setBackground(Color.BLACK);
      p2.add(b10);
      b10.addActionListener(this);

		
		p2.add(b10);
		b10.addActionListener(this);
		add(p1);
		add(p2);
		
		setVisible(true);
	}
	
	public void paintComponent(Graphics g){
		 super.paintComponent(g);
		g.setColor(c1);
		g.fillOval(x1, y1, 30, 30);
		g.fillOval(x2, y2, 30, 30);
		//z1=c1.getRGB();
		if(c1.equals(c2)){
			g.setColor(Color.GREEN);
			g.setFont(new Font("Arial", Font.BOLD,40));
			g.drawString("WIN", 50, 40);
		} else {
			g.setColor(Color.RED);
			g.setFont(new Font("Arial", Font.BOLD,40));
			g.drawString("LOSE", 50, 40);
		}
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b3){
			c2=Color.RED;
			z2=c2.getRGB();
		}
		if(e.getSource() == b4){
			c2=Color.GREEN;
			z2=c2.getRGB();
		}
		if(e.getSource() == b5){
			c2=Color.BLUE;
			z2=c2.getRGB();
		}
		if(e.getSource() == b6){
			c2=Color.PINK;
			z2=c2.getRGB();
		}
		if(e.getSource() == b7){
			c2=Color.orange;
			z2=c2.getRGB();
		}
		if(e.getSource() == b8){
			c2=Color.yellow;
			z2=c2.getRGB();
		}
		if(e.getSource() == b9){
			c2=Color.magenta;
			z2=c2.getRGB();
		}
		if(e.getSource() == b10){
			c2=Color.BLACK;
			z2=c2.getRGB();
		}
		if(e.getSource() == b1){
		w=1;
		
		new Thread1(this);
		new Thread2(this);
		new Thread3(this);
		new Thread4(this);
		new Thread5(this);
		new Thread6(this);
		new Thread7(this);
		new Thread8(this);
		new Thread9(this);
		
		}
		if(e.getSource() == b2){
		w=0;
		}
	}
	public static void main(String args[]){
    JFrame jf = new JFrame("Color Ball Game");
    Color c = new Color(88, 89, 89);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setBounds(200, 50, 600, 600);
    
    Game game = new Game();
   // game.Game(); //  THIS WAS MISSING
    game.savej();
    jf.getContentPane().add(game);
    jf.setVisible(true);
	
	System.out.println("Created by the Junaid, Rashid and Savej Ali");
}
}
class Thread1 extends Thread{
	Game ball;
	Thread1(Game ball){
		this.ball= ball;
		start();
	}
	public void run(){
		System.out.println("THREAD1");
		while(ball.w==1){
			if(ball.x1>=1200)
				ball.x1=0;
			if(ball.x2>=1200)
				ball.x2=20;
			if(ball.y1>=390)
				ball.y1=30;
			if(ball.y2>=395)
				ball.y2=0;
			
			else{
				ball.x1=ball.x1+10;
				ball.x2=ball.x2+4;
				ball.y1=ball.y1+4;
				ball.y2=ball.y2+3;
			}
			
			ball.repaint();
		}
		try{
			Thread.sleep(50000);
		}catch(Exception e1){e1.printStackTrace();}
	}
}

class Thread2 extends Thread{
	Game ball;
	Thread2(Game ball){
		this.ball = ball;
		start();
	}
	
	public void run(){
		while(ball.w==1){
		ball.c1=Color.red;
		ball.repaint();
	}
	try{
		Thread.sleep(50000);
	}catch(Exception e1){e1.printStackTrace();}
	}
}

class Thread3 extends Thread{
	Game ball;
	Thread3(Game ball){
		this.ball= ball;
		start();
	}
	
	public void run(){
		System.out.println("THREAD3");
		while(ball.w==1){
			ball.c1=Color.GREEN;
			ball.repaint();
		}
		
		try{
			Thread.sleep(50000);
		}catch(Exception e1){e1.printStackTrace();}
	}
}

class Thread4 extends Thread{
	Game ball;
	Thread4(Game ball){
		this.ball= ball;
		start();
	}
	
	public void run(){
		System.out.println("THREAD4");
		while(ball.w==1){
			ball.c1=Color.BLUE;
			ball.repaint();
		}
		
		try{
			Thread.sleep(50000);
		}catch(Exception e1){e1.printStackTrace();}
	}
}

class Thread5 extends Thread{
	Game ball;
	Thread5(Game ball){
		this.ball= ball;
		start();
	}
	
	public void run(){
		System.out.println("THREAD5");
		while(ball.w==1){
			ball.c1=Color.PINK;
			ball.repaint();
		}
		
		try{
			Thread.sleep(50000);
		}catch(Exception e1){e1.printStackTrace();}
	}
}

class Thread6 extends Thread{
	Game ball;
	Thread6(Game ball){
		this.ball= ball;
		start();
	}
	
	public void run(){
		while(ball.w==1){
			ball.c1=Color.orange;
			ball.repaint();
		}
		
		try{
			Thread.sleep(50000);
		}catch(Exception e1){e1.printStackTrace();}
	}
}

class Thread7 extends Thread{
	Game ball;
	Thread7(Game ball){
		this.ball= ball;
		start();
	}
	
	public void run(){
		while(ball.w==1){
			ball.c1=Color.YELLOW;
			ball.repaint();
		}
		
		try{
			Thread.sleep(50000);
		}catch(Exception e1){e1.printStackTrace();}
	}
}

class Thread8 extends Thread{
	Game ball;
	Thread8(Game ball){
		this.ball= ball;
		start();
	}
	
	public void run(){
		while(ball.w==1){
			ball.c1=Color.GREEN;
			ball.repaint();
		}
		
		try{
			Thread.sleep(50000);
		}catch(Exception e1){e1.printStackTrace();}
	}
}

class Thread9 extends Thread{
	Game ball;
	Thread9(Game ball){
		this.ball= ball;
		start();
	}
	
	public void run(){
		System.out.println("THREAD3");
		while(ball.w==1){
			ball.c1=Color.GREEN;
			ball.repaint();
		}
		
		try{
			Thread.sleep(50000);
		}catch(Exception e1){e1.printStackTrace();}
	}
}

//-----------------------------------------------------------------
 
   
