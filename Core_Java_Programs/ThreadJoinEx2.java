public class ThreadJoinEx2 extends Thread{
    public void run(){
        for (int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(500);
            }catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadJoinEx2 t1=new ThreadJoinEx2();
        ThreadJoinEx2 t2=new ThreadJoinEx2();
        ThreadJoinEx2 t3=new ThreadJoinEx2();
        t1.start();
        try {
            t1.join(1500);//t2 and t3 join after executing for 1.5 sec
        }catch (Exception e)
        {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
