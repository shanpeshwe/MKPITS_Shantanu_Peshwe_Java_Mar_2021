public class ThreadPriorityEx1 extends Thread{
    public void run(){
        System.out.println("running thread name is:" + Thread.currentThread().getName());
        System.out.println("running thread priority is :" +Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        ThreadPriorityEx1 t1=new ThreadPriorityEx1();
        ThreadPriorityEx1 t2=new ThreadPriorityEx1();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
