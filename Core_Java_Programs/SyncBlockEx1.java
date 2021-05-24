//Program of synchronized block



class Table{
    void printable(int n){
        synchronized (this){//synchronized block
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
    }//end method
}
class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printable(5);
    }

}
class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printable(100);
    }
}
public class SyncBlockEx1 {
    public static void main(String[] args) {
        Table obj=new Table();//only one object
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
    }
}
