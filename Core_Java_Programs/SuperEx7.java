//Another example of super keyword where super() is provided by the compiler implicitly.

class Animal4{
    Animal4(){
        System.out.println("animal is created");
    }
}

class Dog4 extends Animal4{
    Dog4(){
        System.out.println("dog is created");
    }
}

class SuperEx7{
    public static void main(String args[]){
        Dog4 d=new Dog4();//here we call dog but animal is called internally before dog.
    }
}