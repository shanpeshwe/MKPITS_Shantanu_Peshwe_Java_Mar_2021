public class ThreadJoinEx1 extends Thread{
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
        ThreadJoinEx1 t1=new ThreadJoinEx1();
        ThreadJoinEx1 t2=new ThreadJoinEx1();
        ThreadJoinEx1 t3=new ThreadJoinEx1();
        t1.start();
        try {
            t1.join();//t2 and t3 will join after t1 is completly executed
        }catch (Exception e)
        {
            System.out.println(e);
        }
        t2.start();
        t3.start();

    }
}
