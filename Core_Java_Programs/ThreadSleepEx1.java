public class ThreadSleepEx1 extends Thread{
    public void run(){
        for (int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(1500);//adding delay of 1.5 sec
            }catch (Exception ee)
            {
                System.out.println(ee);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSleepEx1 s=new ThreadSleepEx1();
        s.start();
        ThreadSleepEx1 s1=new ThreadSleepEx1();
        s1.start();
    }
}
