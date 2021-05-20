public class ThreadCallEx1 extends Thread{
    public void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        ThreadCallEx1 t=new ThreadCallEx1();
        t.start();
    }
}
