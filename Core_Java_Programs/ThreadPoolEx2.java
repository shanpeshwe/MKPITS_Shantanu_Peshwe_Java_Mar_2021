import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx2 {
    public static void main(String[] args) {
        ExecutorService ex= Executors.newFixedThreadPool(2);//creating a pool of 2 threads
        for (int i=0;i<=10;i++)
        {
            Runnable r=new ThreadPoolEx1(""+i);
            ex.execute(r);//calling execute method for Excutorservice
        }
        ex.shutdown();
        while (!ex.isTerminated()){

        }
        System.out.println("finished all threads");

    }
}
