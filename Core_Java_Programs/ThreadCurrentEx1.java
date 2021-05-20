public class ThreadCurrentEx1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadCurrentEx1 t1=new ThreadCurrentEx1();
        ThreadCurrentEx1 t2=new ThreadCurrentEx1();
        t1.start();
        t2.start();
    }
}
