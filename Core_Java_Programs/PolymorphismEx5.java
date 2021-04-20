//Java Runtime Polymorphism Example: Animal

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eating bread...");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat eating rat...");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("Lion eating meat...");
    }
}
class TestPolymorphism3{
    public static void main(String[] args){
        Animal a;
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
        a=new Lion();
        a.eat();
    }
}