//Example of Deadlock in java

public class DeadlockEx1 {
    public static void main(String[] args) {
        final String resource1="shan";
        final String resource2="shantanu";
        //t1 tries to lock resource1 the resource2
        Thread t1=new Thread(){
            public void run(){
                synchronized (resource1){
                   System.out.println("Thread 1: locked resouce 1");
                   try {
                       Thread.sleep(100);
                   }catch (Exception e)
                   {

                   }
                   synchronized (resource2){
                       System.out.println("Thread 2: locked resource 2");
                   }
                }
            }
        };
        //t2 tries to lock resource2 when resource1
        Thread t2=new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread 2 : locked resource2");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e)
                    {

                    }
                    synchronized (resource1){
                        System.out.println("Thread 2: locked resourec 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
