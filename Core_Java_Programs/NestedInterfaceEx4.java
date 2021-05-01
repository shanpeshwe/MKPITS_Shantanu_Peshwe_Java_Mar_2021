//Example of nested interface which is declared within the interface
//In this example, we are going to learn how to declare the nested interface and how we can access it.

interface Showable{
    void show();
    interface Message{
        void msg();
    }
}
class TestNestedInterface1 implements Showable.Message{
    public void msg(){
        System.out.println("Hello nested interface");
    }

    public static void main(String[] args){
        Showable.Message message=new TestNestedInterface1();//upcasting here
        message.msg();
    }
}
