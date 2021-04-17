//default constructor

public class Bike {
    String color;
    public Bike()
    {
        color="blue";
        System.out.println("bike created"  );
    }

    public static  void main(String[] arg)
    {
        Bike b=new Bike();
        System.out.println("bike color is " + b.color);

    }
}

