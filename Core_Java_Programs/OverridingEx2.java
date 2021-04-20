//Ex-2 of overriding

class Vehicle1 {
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike1 extends Vehicle1 {
    void run(){
        System.out.println("bike is running");
    }
}

class Car1 extends Vehicle1 {
    void run(){
        System.out.println("car is running");
    }
}

//Creating a child class
class honda {
    public static void main(String args[])
    {
        //creating an instance of child class
        Bike1 obj = new Bike1();
        //calling the method with child class instance
        obj.run();

        Car1 obj1 = new Car1();
        //calling the method with child class instance
        obj1.run();
    }
}

