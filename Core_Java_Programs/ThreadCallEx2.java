public class ThreadCallEx2 extends Thread{
    public void run(){
        for (int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(1000);
            }catch (Exception ee)
            {
                System.out.println(ee);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadCallEx2 t1=new ThreadCallEx2();
        t1.start();
        ThreadCallEx2 t2=new ThreadCallEx2();
        t2.start();//it will be treated as a normal objects not thred objects.
    }
}
