//Sort an arraylist

import java.util.ArrayList;
import  java.util.*;

public class ArrayListSortEx1 {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("Enter student name : ");
            String sn=sc.next();
            stud.add(sn);
        }
        Collections.sort(stud);//used to sort the Arraylist

        for(String str : stud) {
            System.out.println("student name " + str);
        }
    }
}
