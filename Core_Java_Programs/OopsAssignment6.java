//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
// First method named as 'setDim' takes length and breadth of rectangle as parameters and the
// second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle
// are entered through keyboard.

import java.util.*;

class Area{
    int length;
    int breadth;

    public void setDim(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
    }

    public float getArea(){
        return length*breadth;
    }
}

public class OopsAssignment6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Area a=new Area();
        System.out.println("Enter Length and Breadth of Rectangle :");
        int length=sc.nextInt();
        int breadth=sc.nextInt();

        a.setDim(length,breadth);
        System.out.println("Area of rectangle : "+a.getArea());
    }
}
