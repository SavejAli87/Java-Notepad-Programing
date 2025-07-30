class Thread1 extends Thread{
    Thread1(String s){
        super(s);
        //start();
    }
    public void run(){
        for(int i=1;i <= 5; i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (Exception e) { }
        }
        System.out.println(getName()+ " dead");
    }
}

class Thread2 extends Thread{
    Thread2(String s){
        super(s);
        //start();
    }
    public void run(){
        for(int i=1;i <= 5; i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (Exception e) { }
        }
        System.out.println(getName()+ " dead");
    }
}

class Thread4 extends Thread{
    Thread4(String s){
        super(s);
        //start();
    }
    public void run(){
        for(int i=1;i <= 5; i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (Exception e) { }
        }
        System.out.println(getName()+ " dead");
    }
}


public class DeamonThread {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1("thread1");
        Thread2 t2 = new Thread2("thread2");
        Thread4 t3 = new Thread4("thread4");
        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();

        for(int i=1; i <=2; i++){
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            }catch (Exception e) { }
        }
        System.out.println(Thread.currentThread().getName()+"dead");
    }
}

