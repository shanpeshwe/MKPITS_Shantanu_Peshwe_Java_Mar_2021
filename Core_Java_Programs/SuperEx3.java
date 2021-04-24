//The super keyword can also be used to invoke parent class method.
// It should be used if subclass contains the same method as parent class.
// In other words, it is used if method is overridden.

class Animal3{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog3 extends Animal3{
    void eat() {
        System.out.println("eating bread...");
    }
    void bark(){
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        bark();
    }
}

class TestSuper3{
    public static void main(String args[]){
        Dog3 d=new Dog3();
        d.work();
    }
}