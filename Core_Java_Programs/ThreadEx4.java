public class ThreadEx4 extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        ThreadEx4 t1=new ThreadEx4();
        ThreadEx4 t2=new ThreadEx4();
        t1.start();
        t2.start();
    }
}