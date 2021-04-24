//In this example, Bike is an abstract class that contains only one abstract method run.
// Its implementation is provided by the Honda class.

abstract class Bike{
    abstract void run();
}
class Honda4 extends Bike{
    void run(){System.out.println("running safely");}
    public static void main(String[] args){
        Bike obj = new Honda4();
        obj.run();
    }
}