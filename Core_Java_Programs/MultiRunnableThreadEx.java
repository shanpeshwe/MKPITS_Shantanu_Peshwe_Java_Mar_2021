public class MultiRunnableThreadEx implements Runnable{
    public void run(){
        System.out.println("task one");
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new MultiRunnableThreadEx());//passing annonymous object of multitaskEx2 class
        Thread t2=new Thread(new MultiRunnableThreadEx());
        t1.start();
        t2.start();

    }
}
