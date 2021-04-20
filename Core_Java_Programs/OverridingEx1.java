//Java Program to illustrate the use of Java Method Overriding
//Creating a parent class.

class Vehicle{
    //defining a method
    void run(){
        System.out.println("Vehicle is running");
    }
}

//Creating a child class
class Bike extends Vehicle{
    //defining the same method as in the parent class
    void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]){
        Vehicle obj = new Vehicle();//creating object
        obj.run();//calling method

        Bike obj1 = new Bike();//creating object
        obj1.run();
    }
}
