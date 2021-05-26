//set and get method in arraylist

import java.util.ArrayList;
import  java.util.*;
public class ArraylistSetAndGet {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("Enter student name : ");
            String sn=sc.next();
            stud.add(sn);
        }
        System.out.println("student at index 1 : "+ stud.get(1));
        stud.set(1,"Rajesh")  ;

        for(String str : stud) {
            System.out.println("Student name : " + str);
        }




    }
}
