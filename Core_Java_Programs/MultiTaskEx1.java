public class MultiTaskEx1 extends Thread{
    public void run(){
        System.out.println("task one");
    }

    public static void main(String[] args) {
        MultiTaskEx1 t1=new MultiTaskEx1();
        MultiTaskEx1 t2=new MultiTaskEx1();
        MultiTaskEx1 t3=new MultiTaskEx1();
        t1.start();
        t2.start();
        t3.start();

    }
}
