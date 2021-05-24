//Program of synchronized block by using annonymous class

class Table1{
    void printable(int n){
        synchronized (this){//aynchronized block
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
public class SyncBlockEx2 {
    public static void main(String[] args) {
        Table1 obj=new Table1();//only one object
        Thread t1=new Thread(){
            public void run(){
                obj.printable(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.printable(100);

            }
        };
        t1.start();
        t2.start();
    }
}
