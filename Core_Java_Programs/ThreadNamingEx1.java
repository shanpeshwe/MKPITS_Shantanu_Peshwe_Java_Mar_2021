public class ThreadNamingEx1 extends Thread{
    public void run(){
        System.out.println("running.");
    }

    public static void main(String[] args) {
        ThreadNamingEx1 t1=new ThreadNamingEx1();
        ThreadNamingEx1 t2=new ThreadNamingEx1();
        System.out.println("name of t1:" + t1.getName());
        System.out.println("name of t2:" + t2.getName());
        t1.start();
        t2.start();

    }
}
