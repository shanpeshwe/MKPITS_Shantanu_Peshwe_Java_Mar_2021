public class ThreadEx3 extends Thread{
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        ThreadEx3 t1=new ThreadEx3();
        ThreadEx3 t2=new ThreadEx3();
        System.out.println("Name of t1:" +t1.getName());
        System.out.println("Name of t2:" +t2.getName());
        System.out.println("id of t1:" +t1.getId());
        System.out.println("id of t2:" +t2.getId());
        t1.start();
        t2.start();
        t1.setName("Shantanu");
        System.out.println("After changing name of t1:" + t1.getName());
        t2.setName("Shan");
        System.out.println("After changing name of t2:" + t2.getName());
    }
}
