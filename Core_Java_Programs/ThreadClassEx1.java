
public class ThreadClassEx1 extends Thread{
    public void run(){
        System.out.printf("thread is running");
    }

    public static void main(String[] args) {
        ThreadClassEx1 t1=new ThreadClassEx1();
        t1.start();
    }
}
