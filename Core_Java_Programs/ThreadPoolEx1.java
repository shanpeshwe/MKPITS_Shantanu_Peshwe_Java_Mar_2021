import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx1 implements Runnable{
    public  String message;
    public ThreadPoolEx1(String s){
        this.message=s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() +"(start) message=" + message);
        processmessage();//call processmessage method that sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName()+"(End)");//prints thread name

    }
    private void processmessage(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
