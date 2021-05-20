public class MultiTaskMutiThreadEx1 extends Thread{
    public void run(){
        System.out.println("task one");
    }
}
class MultiThread extends Thread{
    public void run(){
        System.out.println("task two");
    }
}
class MultiThread1{
    public static void main(String[] args) {
        MultiTaskMutiThreadEx1 t1=new MultiTaskMutiThreadEx1();
        MultiThread t2=new MultiThread();

        t1.start();
        t2.start();//will execute in any order as assigned
    }
}