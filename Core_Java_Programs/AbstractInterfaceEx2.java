//Let's see a simple example where we are using interface and abstract class both.

//Creating interface that has 4 methods
interface A3
{
    void a();//bydefault, public and abstract
    void b();
    void c();
    void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class B3 implements A3{
    public void c(){
        System.out.println("I am C");
    }
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M3 extends B3{
    public void a(){
        System.out.println("I am a");
    }
    public void b(){
        System.out.println("I am b");
    }
    public void d(){
        System.out.println("I am d");
    }
}

//Creating a test class that calls the methods of A interface
class Test7{
    public static void main(String args[]){
        A a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }}
