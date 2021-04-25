//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
// of its length and breadth as parameters of its constructor and having a method named 'returnArea'
// which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;

class Area1{
    int l;
    int b;
    Area1(int l,int b){
    this.l=l;
    this.b=b;
    }

    float returnArea(){
        return l*b;
    }
}

public class OopsAssignment7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle : ");
        int l=sc.nextInt();
        int b=sc.nextInt();

        Area1 a=new Area1(l,b);
        System.out.println("Area of Rectangle is : "+a.returnArea());
    }
}
