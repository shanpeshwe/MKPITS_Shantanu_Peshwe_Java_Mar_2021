//Let's see the simple example of instance initializer block that performs initialization.

class Bike7{
    int speed;

    Bike7(){
        System.out.println("speed is "+speed);
    }

    {speed=100;}//this is initialized first

    public static void main(String args[]){
        Bike7 b1=new Bike7();
        Bike7 b2=new Bike7();
    }
}