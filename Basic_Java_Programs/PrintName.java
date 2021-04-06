//enter and print your name

import java.util.*;

public class PrintName {
    public static void main(String[] args) {
        String name;

//creating an object of scanner class
        //sytax to create object of a class
        // <classname> objectname=new <classname>();
        Scanner sc=new Scanner(System.in); // scan is object of scanner class
        System.out.println("enter name");
        name=sc.next();


        System.out.println("your name   is " +name);
    }

}