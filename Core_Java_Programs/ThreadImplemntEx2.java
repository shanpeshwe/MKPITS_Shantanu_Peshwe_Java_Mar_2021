public class ThreadImplemntEx2 implements Runnable{
    public void run(){
        for (int i=1;i<=5;i++)
        {
            System.out.println("my thread is running" +i);
        }
    }

    public static void main(String[] args) {
        ThreadImplemntEx2 th=new ThreadImplemntEx2();
        Thread t=new Thread(th);
        t.start();
        Thread t1=new Thread(th);
        t1.start();

    }
}
