//In this example, there is no synchronization, so output is inconsistent. Let's see the example:




public class Table {
    void printable(int n){//method is not sycnhronized
        for (int i=1;i<=5;i++)
        {
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
class Notsycn1 extends Thread{
    Table t;
    Notsycn1(Table t)
    {
        this.t=t;
    }
    public void run(){
        t.printable(5);
    }

}
class Notsycn2 extends Thread{
    Table t;
    Notsycn2(Table t){
        this.t=t;
    }
    public void run(){
        t.printable(100);
    }
}
class TestSycnno{
    public static void main(String[] args) {
        Table obj=new Table();//only one object
        Notsycn1 t1=new Notsycn1(obj);
        Notsycn2 t2=new Notsycn2(obj);
        t1.start();
        t2.start();
    }
}