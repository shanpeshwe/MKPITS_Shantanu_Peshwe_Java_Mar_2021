import java.util.ArrayList;
import  java.util.*;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("enter student name : ");
            String sn=sc.next();
            stud.add(sn);
        }
        System.out.println(stud);
    }
}
