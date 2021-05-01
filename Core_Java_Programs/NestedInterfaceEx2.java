//Example of nested interface which is declared within the class
//Let's see how can we define an interface inside the class and how can we access it.

class A{
    interface Message{
        void msg();
    }
}

class TestNestedInterface2 implements A.Message{
    public void msg(){
        System.out.println("Hello nested interface");
    }

    public static void main(String[] args){
        A.Message message=new TestNestedInterface2();//upcasting here
        message.msg();
    }
}
