public class DaemonEx1 extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()){//checking for daemon Thread
            System.out.println("daemon thread work");

        }
        else {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        DaemonEx1 d1=new DaemonEx1();//creating thread
        DaemonEx1 d2=new DaemonEx1();
        DaemonEx1 d3=new DaemonEx1();

        d1.setDaemon(true);//now d1 is daemon thread

        d1.start();
        d2.start();
        d3.start();
    }
}
