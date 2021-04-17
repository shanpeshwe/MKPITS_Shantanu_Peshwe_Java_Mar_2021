//wap to create a string array of 5 elements to store 5 person name
import java.util.*;

public class ExampleOfStringArray {
    public static void main(String[] args){
        int a;
        String name[]=new String[5];
        Scanner sc=new Scanner(System.in);

        for(a=0;a<5;a++){
            System.out.println("Enter any name : ");
            name[a]=sc.next();
        }
        for(a=0;a<5;a++){
            System.out.println("Entered name is : "+name[a]);
        }
    }
}