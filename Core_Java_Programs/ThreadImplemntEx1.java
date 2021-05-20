public class ThreadImplemntEx1 implements Runnable{
    public void run(){
        System.out.printf("thread is running...");
    }

    public static void main(String[] args) {
        ThreadImplemntEx1 t=new ThreadImplemntEx1();
        Thread t1=new Thread(t);
        t1.start();
    }
}
