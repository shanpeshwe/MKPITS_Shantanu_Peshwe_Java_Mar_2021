//create a class car having field color, make , brand and methods getdata(), showdata() and startenginge
import java.util.*;

public class ExampleOfClassCar {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Car c1=new Car();

        System.out.println("Enter Car Color, make and brand : ");
        String c=sc.next();
        String m=sc.next();
        String b=sc.next();

        c1.getdata(c,m,b);
        c1.showdata();
        c1.startengine();
    }

    static class Car {
        String color;
        String make;
        String brand;

        void getdata(String c,String m,String b) {
        color=c;
        make=m;
        brand=b;
        }

        void showdata() {
        System.out.println("Car Color : "+color);
        System.out.println("Car Make : "+make);
        System.out.println("Car Brand : "+brand);
        }

        void startengine() {
        System.out.println("Engine is Started.");
        }
    }
}