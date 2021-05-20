public class ThreadPriorityEx2 extends Thread{
    public void run(){
        System.out.println("current thread name :" +Thread.currentThread().getName());
        System.out.println("current thread priroty :" +Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        ThreadPriorityEx2 t1=new ThreadPriorityEx2();
        ThreadPriorityEx2 t2=new ThreadPriorityEx2();
        ThreadPriorityEx2 t3=new ThreadPriorityEx2();
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
