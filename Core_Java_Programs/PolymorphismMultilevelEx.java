//Let's see the simple example of Runtime Polymorphism with multilevel inheritance.

class Animal3{
    void eat(){
        System.out.println("eating");
    }
}
class Dog3 extends Animal3{
    void eat(){
        System.out.println("eating fruits");
    }
}
class BabyDog extends Dog3{
    void eat(){
        System.out.println("drinking milk");
    }
    public static void main(String args[]){
        Animal3 a1,a2,a3;
        a1=new Animal3();
        a2=new Dog3();
        a3=new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}