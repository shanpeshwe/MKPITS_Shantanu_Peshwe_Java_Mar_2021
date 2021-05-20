public class DaemonEx2 extends Thread{
    public void run(){
        System.out.println("Name:" +Thread.currentThread().getName());
        System.out.println("Daemon :" +Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        DaemonEx2 d1=new DaemonEx2();
        DaemonEx2 d2=new DaemonEx2();
        d1.start();
        //d1.setDaemon(true);//we cannot declare a executed thread as demon thread
        d2.start();
    }
}
