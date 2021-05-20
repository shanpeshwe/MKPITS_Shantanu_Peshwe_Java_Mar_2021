public class ThreadGroupEx1 implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupEx1 Runnable=new ThreadGroupEx1();
        ThreadGroup tg1=new ThreadGroup("parent thread group");
        Thread t1=new Thread(tg1,Runnable,"one");
        t1.start();
        Thread t2=new Thread(tg1,Runnable,"two");
        t2.start();
        Thread t3=new Thread(tg1,Runnable,"three");
        t3.start();

        System.out.println("Thread group name :" +tg1.getName());
        tg1.list();
    }
}
