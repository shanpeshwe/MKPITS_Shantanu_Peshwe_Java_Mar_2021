//example of interface inheritance
//interface can only extend other interface

interface Printable4{
    void print();
}

interface Showable4 extends Printable4{
    void show();
}

class TestInterface4 implements Showable4{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }

    public static void main(String args[]){
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
    }
}