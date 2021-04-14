//create a class dog having fields breed , height and color and methods getdata and showdata and bark.
import java.util.*;

public class ExampleOfDogClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dog d1=new Dog();
        System.out.println("Enter Dog breed, height and color : ");
        String br=sc.next();
        int h=sc.nextInt();
        String cl=sc.next();
        d1.getdata(br,h,cl);
        d1.showdata();
    }
    static class Dog{
        String breed;
        int height;
        String color;
        void getdata(String br,int h,String cl){
            breed=br;
            height=h;
            color=cl;
        }
        void showdata(){
            System.out.println("Dog Breed : "+breed);
            System.out.println("Dog Height : "+height);
            System.out.println("Dog Color : "+color);
        }
    }

}
