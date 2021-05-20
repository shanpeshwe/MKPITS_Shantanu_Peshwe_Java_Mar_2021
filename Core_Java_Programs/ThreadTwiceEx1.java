public class ThreadTwiceEx1 extends Thread{
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        ThreadTwiceEx1 t=new ThreadTwiceEx1();
        t.start();
        //t.start(); there is no start to use again
    }
}
