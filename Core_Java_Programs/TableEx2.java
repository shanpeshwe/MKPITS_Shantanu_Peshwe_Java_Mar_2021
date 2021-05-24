////example of java synchronized method

public class TableEx2 {
    synchronized void printable(int n){//sycnronized method
        for (int i=1;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
class syncthread1 extends Thread{
    TableEx2 t;
    syncthread1(TableEx2 t){
        this.t=t;
    }
    public void run(){
        t.printable(5);
    }
}
class syncthread2 extends Thread{
    TableEx2 t;
    syncthread2(TableEx2 t){
        this.t=t;
    }
    public void run(){
        t.printable(100);
    }
}
class Syncronization{
    public static void main(String[] args) {
        TableEx2 obj=new TableEx2();
        syncthread1 t1=new syncthread1(obj);
        syncthread2 t2=new syncthread2(obj);
        t1.start();
        t2.start();
    }
}