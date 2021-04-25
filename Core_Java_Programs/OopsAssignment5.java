//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
// creating a class named 'Rectangle' with a method named 'Area' which returns the area
// and length and breadth passed as parameters to its constructor.

class Rectangle{
    int length,breadth;

    public float area(){
        return length*breadth;
    }
}

public class OopsAssignment5 {
    public static void main(String[] args) {
    Rectangle r1=new Rectangle();
    r1.breadth=4;
    r1.length=5;

    Rectangle r2=new Rectangle();
    r2.breadth=5;
    r2.length=8;

    System.out.println("Area of rectangle 1 : "+r1.area());
    System.out.println("Area of rectangle 2 : "+r2.area());
    }
}
